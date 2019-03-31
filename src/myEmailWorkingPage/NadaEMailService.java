package myEmailWorkingPage;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

public class NadaEMailService {

    private static final String NADA_EMAIL_DOMAIN = "@nada.ltd";
    private static final String INBOX_MESSAGE_KEY_NAME = "msgs";
    private static final String EMAIL_ID_ROUTE_PARAM = "email-id";
    private static final String MESSAGE_ID_ROUTE_PARAM = "message-id";
    private static final String NADA_EMAIL_INBOX_API = "https://getnada.com/api/v1/inboxes/{email-id}";
    private static final String NADA_EMAIL_MESSAGE_API = "https://getnada.com/api/v1/messages/{message-id}";
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final int EMAIL_CHARS_LENGTH = 10;

    private String emailId;


    private void generateEmailId(){
        this.emailId = RandomStringUtils.randomAlphanumeric(EMAIL_CHARS_LENGTH).toLowerCase().concat(NADA_EMAIL_DOMAIN);
    }

    //generates a random email for the first time.
    //call reset for a new random email
    public String getEmailId(){
        if(Objects.isNull(this.emailId)){
            this.generateEmailId();
        }
        return this.emailId;
    }

    //to re-generate a new random email id
    public void reset(){
        this.emailId = null;
    }

    public List<InboxEmail> getInbox() {
        String msgs = Unirest.get(NADA_EMAIL_INBOX_API)
                            .routeParam(EMAIL_ID_ROUTE_PARAM, this.getEmailId())
                            .asJson()
                            .getBody()
                            .getObject()
                            .getJSONArray(INBOX_MESSAGE_KEY_NAME)
                            .toString();
        return MAPPER.readValue(msgs, new TypeReference<List<InboxEmail>>() {});
    }

    public EmailMessage getMessageById(final String messageId) {
        String msgs = Unirest.get(NADA_EMAIL_MESSAGE_API)
                                .routeParam(MESSAGE_ID_ROUTE_PARAM, messageId)
                                .asJson()
                                .getBody()
                                .getObject()
                                .toString();
        return MAPPER.readValue(msgs, EmailMessage.class);
    }

    public EmailMessage getMessageWithSubjectStartsWith(final String emailSubject) {
        return  this.getInbox()
                    .stream()
                    .filter(ie -> ie.getSubject().startsWith(emailSubject))
                    .findFirst()
                    .map(InboxEmail::getMessageId)
                    .map(this::getMessageById)
                    .orElseThrow(IllegalArgumentException::new);
    }

}