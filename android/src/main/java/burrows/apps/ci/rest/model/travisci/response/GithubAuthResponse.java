package burrows.apps.ci.rest.model.travisci.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#creating-a-temporary-github-token">https://docs.travis-ci.com/api#creating-a-temporary-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class GithubAuthResponse {
  @SerializedName("access_token") @Expose private String accessToken;

  public GithubAuthResponse() { }
  public GithubAuthResponse(String accessToken) { this.accessToken = accessToken; }

  public String getAccessToken() { return accessToken; }
  public void setAccessToken(String accessToken) { this.accessToken = accessToken; }
  public GithubAuthResponse withAccessToken(String accessToken) { this.accessToken = accessToken; return this; }
}
