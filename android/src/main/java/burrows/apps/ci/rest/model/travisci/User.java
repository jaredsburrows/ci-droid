package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#users">https://docs.travis-ci.com/api?http#users</a>
 */
@Generated("org.jsonschema2pojo")
public class User {
  @SerializedName("id")             @Expose private Long    id;
  @SerializedName("login")          @Expose private String  login;
  @SerializedName("name")           @Expose private String  name;
  @SerializedName("email")          @Expose private String  email;
  @SerializedName("gravatar_id")    @Expose private String  gravatarId;
  @SerializedName("is_syncing")     @Expose private Boolean isSyncing;
  @SerializedName("synced_at")      @Expose private String  syncedAt;
  @SerializedName("correct_scopes") @Expose private Boolean correctScopes;
  @SerializedName("created_at")     @Expose private String  createdAt; // this came in the example

  public User() { }
  public User(Long id, String login, String name, String email, String gravatarId, Boolean isSyncing,
              String syncedAt, Boolean correctScopes, String createdAt) {
    this.id = id;
    this.login = login;
    this.name = name;
    this.email = email;
    this.gravatarId = gravatarId;
    this.isSyncing = isSyncing;
    this.syncedAt = syncedAt;
    this.correctScopes = correctScopes;
    this.createdAt = createdAt;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public User withId(Long id) { this.id = id; return this; }

  public String getLogin() { return login; }
  public void setLogin(String login) { this.login = login; }
  public User withLogin(String login) { this.login = login; return this; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public User withName(String name) { this.name = name; return this; }

  public String getEmail() { return email; }
  public void setEmail(String email) { this.email = email; }
  public User withEmail(String email) { this.email = email; return this; }

  public String getGravatarId() { return gravatarId; }
  public void setGravatarId(String gravatarId) { this.gravatarId = gravatarId; }
  public User withGravatarId(String gravatarId) { this.gravatarId = gravatarId; return this; }

  public Boolean isIsSyncing() { return isSyncing; }
  public void setIsSyncing(boolean isSyncing) { this.isSyncing = isSyncing; }
  public User withIsSyncing(boolean isSyncing) { this.isSyncing = isSyncing; return this; }

  public String getSyncedAt() { return syncedAt; }
  public void setSyncedAt(String syncedAt) { this.syncedAt = syncedAt; }
  public User withSyncedAt(String syncedAt) { this.syncedAt = syncedAt; return this; }

  public Boolean isCorrectScopes() { return correctScopes; }
  public void setCorrectScopes(Boolean correctScopes) { this.correctScopes = correctScopes; }
  public User withCorrectScopes(Boolean correctScopes) { this.correctScopes = correctScopes; return this; }

  public String getCreatedAt() { return createdAt; }
  public void setCreatedAt(String createdAt) { this.createdAt = createdAt; }
  public User withCreatedAt(String createdAt) { this.createdAt = createdAt; return this; }
}
