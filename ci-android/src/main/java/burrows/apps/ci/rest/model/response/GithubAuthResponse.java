package burrows.apps.ci.rest.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * HTTP/1.1 200 OK
 * Content-Type: application/json
 * <p>
 * {"access_token":"YOUR TRAVIS ACCESS TOKEN"}
 */
@Generated("org.jsonschema2pojo")
public class GithubAuthResponse {
  @SerializedName("access_token") @Expose private String accessToken;

  /**
   * No args constructor for use in serialization
   */
  public GithubAuthResponse() {
  }

  /**
   * @param accessToken
   */
  public GithubAuthResponse(String accessToken) {
    this.accessToken = accessToken;
  }

  /**
   * @return The accessToken
   */
  public String getAccessToken() {
    return accessToken;
  }

  /**
   * @param accessToken The access_token
   */
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public GithubAuthResponse withAccessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }
}
