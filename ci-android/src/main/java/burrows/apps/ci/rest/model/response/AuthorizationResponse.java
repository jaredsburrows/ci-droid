package burrows.apps.ci.rest.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * HTTP/1.1 201 Created
 * Content-Type: application/json
 * <p>
 * {
 * "id": 1,
 * "url": "https://api.github.com/authorizations/1",
 * "scopes": [
 * "read:org", "user:email", "repo_deployment",
 * "repo:status", "write:repo_hook"
 * ],
 * "token": "YOUR GITHUB TOKEN",
 * "note": "temporary token to auth against travis"
 * }
 */
@Generated("org.jsonschema2pojo")
public class AuthorizationResponse {
  @SerializedName("id") @Expose private long id;
  @SerializedName("url") @Expose private String url;
  @SerializedName("scopes") @Expose private List<String> scopes = new ArrayList<String>();
  @SerializedName("token") @Expose private String token;
  @SerializedName("note") @Expose private String note;

  /**
   * No args constructor for use in serialization
   */
  public AuthorizationResponse() {
  }

  /**
   * @param id
   * @param scopes
   * @param token
   * @param note
   * @param url
   */
  public AuthorizationResponse(long id, String url, List<String> scopes, String token, String note) {
    this.id = id;
    this.url = url;
    this.scopes = scopes;
    this.token = token;
    this.note = note;
  }

  /**
   * @return The id
   */
  public long getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(long id) {
    this.id = id;
  }

  public AuthorizationResponse withId(long id) {
    this.id = id;
    return this;
  }

  /**
   * @return The url
   */
  public String getUrl() {
    return url;
  }

  /**
   * @param url The url
   */
  public void setUrl(String url) {
    this.url = url;
  }

  public AuthorizationResponse withUrl(String url) {
    this.url = url;
    return this;
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

  public AuthorizationResponse withScopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  /**
   * @return The token
   */
  public String getToken() {
    return token;
  }

  /**
   * @param token The token
   */
  public void setToken(String token) {
    this.token = token;
  }

  public AuthorizationResponse withToken(String token) {
    this.token = token;
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

  public AuthorizationResponse withNote(String note) {
    this.note = note;
    return this;
  }
}
