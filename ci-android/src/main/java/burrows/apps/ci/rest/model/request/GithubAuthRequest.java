package burrows.apps.ci.rest.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * POST /auth/github HTTP/1.1
 * User-Agent: MyClient/1.0.0
 * Accept: application/vnd.travis-ci.2+json
 * Host: api.travis-ci.org
 * Content-Type: application/json
 * Content-Length: 37
 * <p>
 * {"github_token":"YOUR GITHUB TOKEN"}
 *
 * @see <a href="https://docs.travis-ci.com/api#creating-a-temporary-github-token">https://docs.travis-ci.com/api#creating-a-temporary-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class GithubAuthRequest {
  @SerializedName("github_token") @Expose private String githubToken;

  /**
   * No args constructor for use in serialization
   */
  public GithubAuthRequest() {
  }

  /**
   * @param githubToken
   */
  public GithubAuthRequest(String githubToken) {
    this.githubToken = githubToken;
  }

  /**
   * @return The githubToken
   */
  public String getGithubToken() {
    return githubToken;
  }

  /**
   * @param githubToken The github_token
   */
  public void setGithubToken(String githubToken) {
    this.githubToken = githubToken;
  }

  public GithubAuthRequest withGithubToken(String githubToken) {
    this.githubToken = githubToken;
    return this;
  }
}
