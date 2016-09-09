package burrows.apps.ci.rest.model.travisci.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#with-a-github-token">https://docs.travis-ci.com/api#with-a-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class AuthorizationRequest {
  @SerializedName("scopes") @Expose private List<String> scopes = new ArrayList<>();
  @SerializedName("note")   @Expose private String        note;

  public AuthorizationRequest() { }
  public AuthorizationRequest(List<String> scopes, String note) {
    this.scopes = scopes;
    this.note = note;
  }

  public List<String> getScopes() { return scopes; }
  public void setScopes(List<String> scopes) { this.scopes = scopes; }
  public AuthorizationRequest withScopes(List<String> scopes) { this.scopes = scopes; return this; }

  public String getNote() { return note; }
  public void setNote(String note) { this.note = note; }
  public AuthorizationRequest withNote(String note) { this.note = note; return this; }
}
