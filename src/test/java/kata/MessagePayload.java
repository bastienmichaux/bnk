package kata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Message payload for POST requests.
 *
 */
public class MessagePayload {

    @JsonProperty
    private int messageid;

    @JsonProperty
    private String name;

    @JsonProperty
    private String email;

    @JsonProperty
    private String phone;

    @JsonProperty
    private String subject;

    @JsonProperty
    private String description;

    public MessagePayload(String name, String email, String phone, String subject, String description) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.subject = subject;
        this.description = description;
    }
}
