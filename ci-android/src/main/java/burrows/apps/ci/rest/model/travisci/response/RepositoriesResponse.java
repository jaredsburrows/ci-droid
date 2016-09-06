package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Repo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#repositories">https://docs.travis-ci.com/api#repositories</a>
 */
@Generated("org.jsonschema2pojo")
public class RepositoriesResponse {
  @SerializedName("repo") @Expose private Repo repo;

  public RepositoriesResponse() { }
  public RepositoriesResponse(Repo repo) { this.repo = repo; }

  public Repo getRepo() { return repo; }
  public void setRepo(Repo repo) { this.repo = repo; }
  public RepositoriesResponse withRepo(Repo repo) { this.repo = repo; return this; }
}
