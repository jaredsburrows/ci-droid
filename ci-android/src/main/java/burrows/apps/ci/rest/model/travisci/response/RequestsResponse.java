package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Commit;
import burrows.apps.ci.rest.model.travisci.Request;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#requests">https://docs.travis-ci.com/api#requests</a>
 */
@Generated("org.jsonschema2pojo")
public class RequestsResponse {
  @SerializedName("request")  @Expose private Request request;
  @SerializedName("commit")   @Expose private Commit  commit;

  public RequestsResponse() { }
  public RequestsResponse(Request request, Commit commit) {
    this.request = request;
    this.commit = commit;
  }

  public Request getRequest() { return request; }
  public void setRequest(Request request) { this.request = request; }
  public RequestsResponse withRequest(Request request) { this.request = request; return this; }

  public Commit getCommit() { return commit; }
  public void setCommit(Commit commit) { this.commit = commit; }
  public RequestsResponse withCommit(Commit commit) { this.commit = commit; return this; }
}
