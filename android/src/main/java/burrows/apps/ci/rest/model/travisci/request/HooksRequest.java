package burrows.apps.ci.rest.model.travisci.request;

import burrows.apps.ci.rest.model.travisci.Hook;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#hooks">https://docs.travis-ci.com/api#hooks</a>
 */
@Generated("org.jsonschema2pojo")
public class HooksRequest {
  @SerializedName("hook") @Expose private Hook hook;

  public HooksRequest() { }
  public HooksRequest(Hook hook) { this.hook = hook; }

  public Hook getHook() { return hook; }
  public void setHook(Hook hook) { this.hook = hook; }
  public HooksRequest withHook(Hook hook) { this.hook = hook; return this; }
}
