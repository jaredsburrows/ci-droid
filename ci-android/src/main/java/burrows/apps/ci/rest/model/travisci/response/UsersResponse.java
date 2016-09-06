package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.User;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class UsersResponse {
  @SerializedName("user") @Expose private User user;

  public UsersResponse() { }
  public UsersResponse(User user) { this.user = user; }

  public User getUser() { return user; }
  public void setUser(User user) { this.user = user; }
  public UsersResponse withUser(User user) { this.user = user; return this; }
}
