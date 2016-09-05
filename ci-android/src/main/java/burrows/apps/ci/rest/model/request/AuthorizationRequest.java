package burrows.apps.ci.rest.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * POST /authorizations HTTP/1.1
 * Host: api.github.com
 * Content-Type: application/json
 * Authorization: Basic ...
 * <p>
 * {
 * "scopes": [
 * "read:org", "user:email", "repo_deployment",
 * "repo:status", "write:repo_hook"
 * ],
 * "note": "temporary token to auth against travis"
 * }
 * @see <a href="https://docs.travis-ci.com/api#with-a-github-token">https://docs.travis-ci.com/api#with-a-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class AuthorizationRequest {
  @SerializedName("scopes") @Expose private List<String> scopes = new ArrayList<String>();
  @SerializedName("note") @Expose private String note;

  /**
   * No args constructor for use in serialization
   */
  public AuthorizationRequest() {
  }

  /**
   * @param scopes
   * @param note
   */
  public AuthorizationRequest(List<String> scopes, String note) {
    this.scopes = scopes;
    this.note = note;
  }

  /**
   * @return The scopes
   */
  public List<String> getScopes() {
    return scopes;
  }

  /**
   * @param scopes The scopes
   */
  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public AuthorizationRequest withScopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * @return The note
   */
  public String getNote() {
    return note;
  }

  /**
   * @param note The note
   */
  public void setNote(String note) {
    this.note = note;
  }

  public AuthorizationRequest withNote(String note) {
    this.note = note;
    return this;
  }
}
