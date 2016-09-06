package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Cache;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#caches">https://docs.travis-ci.com/api#caches</a>
 */
@Generated("org.jsonschema2pojo")
public class CachesResponse {
  @SerializedName("caches") @Expose private List<Cache> caches = new ArrayList<>();

  public CachesResponse() { }
  public CachesResponse(List<Cache> caches) {this.caches = caches; }

  public List<Cache> getCaches() { return caches; }
  public void setCaches(List<Cache> caches) { this.caches = caches; }
  public CachesResponse withCaches(List<Cache> caches) { this.caches = caches; return this; }
}
