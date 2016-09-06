package burrows.apps.ci.rest.model.travisci.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#permissions">https://docs.travis-ci.com/api#permissions</a>
 */
@Generated("org.jsonschema2pojo")
public class PermissionsRequest {
  @SerializedName("permissions")  @Expose private List<Long>  permissions = new ArrayList<>();
  @SerializedName("admin")        @Expose private List<Long>  admin = new ArrayList<>();
  @SerializedName("pull")         @Expose private List<Long>  pull = new ArrayList<>();
  @SerializedName("push")         @Expose private List<Long>  push = new ArrayList<>();

  public PermissionsRequest() { }
  public PermissionsRequest(List<Long> permissions, List<Long> admin, List<Long> pull, List<Long> push) {
    this.permissions = permissions;
    this.admin = admin;
    this.pull = pull;
    this.push = push;
  }

  public List<Long> getPermissions() { return permissions; }
  public void setPermissions(List<Long> permissions) { this.permissions = permissions; }
  public PermissionsRequest withPermissions(List<Long> permissions) { this.permissions = permissions; return this; }

  public List<Long> getAdmin() { return admin; }
  public void setAdmin(List<Long> admin) { this.admin = admin; }
  public PermissionsRequest withAdmin(List<Long> admin) { this.admin = admin; return this; }

  public List<Long> getPull() { return pull; }
  public void setPull(List<Long> pull) { this.pull = pull; }
  public PermissionsRequest withPull(List<Long> pull) { this.pull = pull; return this; }

  public List<Long> getPush() { return push; }
  public void setPush(List<Long> push) { this.push = push; }
  public PermissionsRequest withPush(List<Long> push) { this.push = push; return this; }
}
