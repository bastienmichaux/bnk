package kata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Authentication payload.
 *
 *
 */
public class AuthPayload {

    @JsonProperty
    private String username;

    @JsonProperty
    private String password;

    public AuthPayload(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
