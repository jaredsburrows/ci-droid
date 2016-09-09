package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Broadcast;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#broadcasts">https://docs.travis-ci.com/api#broadcasts</a>
 */
@Generated("org.jsonschema2pojo")
public class BroadcastsResponse {
  @SerializedName("broadcasts") @Expose private List<Broadcast> broadcasts = new ArrayList<>();

  public BroadcastsResponse() { }
  public BroadcastsResponse(List<Broadcast> broadcasts) { this.broadcasts = broadcasts; }

  public List<Broadcast> getBroadcasts() { return broadcasts; }
  public void setBroadcasts(List<Broadcast> broadcasts) { this.broadcasts = broadcasts; }
  public BroadcastsResponse withBroadcasts(List<Broadcast> broadcasts) { this.broadcasts = broadcasts; return this; }
}
