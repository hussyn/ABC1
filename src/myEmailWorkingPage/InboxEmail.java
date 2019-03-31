package myEmailWorkingPage;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InboxEmail {

    @JsonProperty("uid")
    private String messageId;

    @JsonProperty("f")
    private String from;

    @JsonProperty("s")
    private String subject;

    public String getMessageId() {
        return messageId;
    }

    public String getFrom() {
        return from;
    }

    public String getSubject() {
        return subject;
    }
}
