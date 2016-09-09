package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class SshKey {

  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("fingerprint")
  @Expose
  private String fingerprint;

  /**
   * No args constructor for use in serialization
   */
  public SshKey() {
  }

  /**
   * @param fingerprint
   * @param description
   */
  public SshKey(String description, String fingerprint) {
    this.description = description;
    this.fingerprint = fingerprint;
  }

  /**
   * @return The description
   */
  public String getDescription() {
    return description;
  }

  /**
   * @param description The description
   */
  public void setDescription(String description) {
    this.description = description;
  }

  public SshKey withDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * @return The fingerprint
   */
  public String getFingerprint() {
    return fingerprint;
  }

  /**
   * @param fingerprint The fingerprint
   */
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }

  public SshKey withFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }
}
