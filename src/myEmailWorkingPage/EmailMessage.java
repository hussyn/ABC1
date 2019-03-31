package myEmailWorkingPage;

@JsonIgnoreProperties(ignoreUnknown=true)
public class EmailMessage {

    @JsonProperty("html")
    private String html;

    @JsonProperty("text")
    private String text;

    public String getHtml() {
        return html;
    }

    public String getText() {
        return text;
    }
}