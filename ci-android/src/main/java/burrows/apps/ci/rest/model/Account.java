package burrows.apps.ci.rest.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Account {
  @SerializedName("repos_count") @Expose private long reposCount;
  @SerializedName("name") @Expose private String name;
  @SerializedName("type") @Expose private String type;
  @SerializedName("id") @Expose private long id;
  @SerializedName("login") @Expose private String login;

  /**
   * No args constructor for use in serialization
   */
  public Account() {
  }

  /**
   * @param id
   * @param reposCount
   * @param name
   * @param login
   * @param type
   */
  public Account(long reposCount, String name, String type, long id, String login) {
    this.reposCount = reposCount;
    this.name = name;
    this.type = type;
    this.id = id;
    this.login = login;
  }

  /**
   * @return The reposCount
   */
  public long getReposCount() {
    return reposCount;
  }

  /**
   * @param reposCount The repos_count
   */
  public void setReposCount(long reposCount) {
    this.reposCount = reposCount;
  }

  public Account withReposCount(long reposCount) {
    this.reposCount = reposCount;
    return this;
  }

  /**
   * @return The name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name
   */
  public void setName(String name) {
    this.name = name;
  }

  public Account withName(String name) {
    this.name = name;
    return this;
  }

  /**
   * @return The type
   */
  public String getType() {
    return type;
  }

  /**
   * @param type The type
   */
  public void setType(String type) {
    this.type = type;
  }

  public Account withType(String type) {
    this.type = type;
    return this;
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

  public Account withId(long id) {
    this.id = id;
    return this;
  }

  /**
   * @return The login
   */
  public String getLogin() {
    return login;
  }

  /**
   * @param login The login
   */
  public void setLogin(String login) {
    this.login = login;
  }

  public Account withLogin(String login) {
    this.login = login;
    return this;
  }
}
