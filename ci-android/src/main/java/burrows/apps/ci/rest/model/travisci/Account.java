package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#accounts>https://docs.travis-ci.com/api?http#accounts</a>
 */
@Generated("org.jsonschema2pojo")
public class Account {
  @SerializedName("id")           @Expose private Long    id;
  @SerializedName("name")         @Expose private String  name;
  @SerializedName("login")        @Expose private String  login;
  @SerializedName("type")         @Expose private String  type;
  @SerializedName("repos_count")  @Expose private Long    reposCount;
  @SerializedName("subscribed")   @Expose private Boolean subscribed;

  public Account() { }
  public Account(Long id, String name, String login, String type, Long reposCount, Boolean subscribed) {
    this.id = id;
    this.name = name;
    this.login = login;
    this.type = type;
    this.reposCount = reposCount;
    this.subscribed = subscribed;
  }

  public Long getId() {return id; }
  public void setId(Long id) { this.id = id; }
  public Account withId(Long id) { this.id = id; return this; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public Account withName(String name) { this.name = name; return this; }

  public String getLogin() { return login; }
  public void setLogin(String login) { this.login = login; }
  public Account withLogin(String login) { this.login = login; return this; }

  public Long getReposCount() { return reposCount; }
  public void setReposCount(Long reposCount) { this.reposCount = reposCount; }
  public Account withReposCount(Long reposCount) {this.reposCount = reposCount; return this; }

  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public Account withType(String type) { this.type = type; return this; }

  public String getSubscribed() { return type; }
  public void setSubscribed(Boolean subscribed) { this.type = type; }
  public Account withSubscribed(Boolean subscribed) { this.type = type; return this; }
}
