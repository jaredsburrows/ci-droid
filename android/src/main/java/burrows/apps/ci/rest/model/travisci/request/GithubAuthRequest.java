package burrows.apps.ci.rest.model.travisci.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#with-a-github-token">https://docs.travis-ci.com/api#with-a-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class GithubAuthRequest {
  @SerializedName("github_token") @Expose private String githubToken;

  public GithubAuthRequest() { }
  public GithubAuthRequest(String githubToken) { this.githubToken = githubToken; }

  public String getGithubToken() { return githubToken; }
  public void setGithubToken(String githubToken) { this.githubToken = githubToken; }
  public GithubAuthRequest withGithubToken(String githubToken) { this.githubToken = githubToken; return this; }
}
