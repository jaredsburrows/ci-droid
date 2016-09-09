package burrows.apps.ci.rest.model.travisci.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#creating-a-temporary-github-token">https://docs.travis-ci.com/api#creating-a-temporary-github-token</a>
 */
@Generated("org.jsonschema2pojo")
public class AuthorizationResponse {
  @SerializedName("id")     @Expose private Long          id;
  @SerializedName("url")    @Expose private String        url;
  @SerializedName("scopes") @Expose private List<String>  scopes = new ArrayList<>();
  @SerializedName("token")  @Expose private String        token;
  @SerializedName("note")   @Expose private String        note;

  public AuthorizationResponse() { }
  public AuthorizationResponse(Long id, String url, List<String> scopes, String token, String note) {
    this.id = id;
    this.url = url;
    this.scopes = scopes;
    this.token = token;
    this.note = note;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public AuthorizationResponse withId(Long id) { this.id = id; return this; }

  public String getUrl() { return url; }
  public void setUrl(String url) { this.url = url; }
  public AuthorizationResponse withUrl(String url) { this.url = url; return this; }

  public List<String> getScopes() { return scopes; }
  public void setScopes(List<String> scopes) { this.scopes = scopes; }
  public AuthorizationResponse withScopes(List<String> scopes) { this.scopes = scopes; return this; }

  public String getToken() { return token; }
  public void setToken(String token) { this.token = token; }
  public AuthorizationResponse withToken(String token) { this.token = token; return this; }

  public String getNote() { return note; }
  public void setNote(String note) { this.note = note; }
  public AuthorizationResponse withNote(String note) { this.note = note; return this; }
}
