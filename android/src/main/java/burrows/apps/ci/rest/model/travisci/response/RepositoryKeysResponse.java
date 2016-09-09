package burrows.apps.ci.rest.model.travisci.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#repository-keys">https://docs.travis-ci.com/api#repository-keys</a>
 */
@Generated("org.jsonschema2pojo")
public class RepositoryKeysResponse {
  @SerializedName("key")          @Expose private String key;
  @SerializedName("fingerprint")  @Expose private String fingerprint;

  public RepositoryKeysResponse() { }
  public RepositoryKeysResponse(String key, String fingerprint) {
    this.key = key;
    this.fingerprint = fingerprint;
  }

  public String getKey() {return key; }
  public void setKey(String key) { this.key = key; }
  public RepositoryKeysResponse withKey(String key) {this.key = key; return this; }

  public String getFingerprint() {return fingerprint; }
  public void setFingerprint(String fingerprint) { this.fingerprint = fingerprint; }
  public RepositoryKeysResponse withFingerprint(String fingerprint) { this.fingerprint = fingerprint; return this; }
}
