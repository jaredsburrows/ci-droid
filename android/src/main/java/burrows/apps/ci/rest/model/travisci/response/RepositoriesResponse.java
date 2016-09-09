package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Repository;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#repositories">https://docs.travis-ci.com/api#repositories</a>
 */
@Generated("org.jsonschema2pojo")
public class RepositoriesResponse {
  @SerializedName("repo") @Expose private Repository repository;

  public RepositoriesResponse() { }
  public RepositoriesResponse(Repository repo) { this.repository = repo; }

  public Repository getRepository() { return repository; }
  public void setRepository(Repository repository) { this.repository = repository; }
  public RepositoriesResponse withRepo(Repository repo) { this.repository = repo; return this; }
}
