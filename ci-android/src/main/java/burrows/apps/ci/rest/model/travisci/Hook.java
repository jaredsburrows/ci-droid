package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Hook {

  @SerializedName("id")
  @Expose
  private Long id;
  @SerializedName("active")
  @Expose
  private boolean active;

  /**
   * No args constructor for use in serialization
   */
  public Hook() {
  }

  /**
   * @param id
   * @param active
   */
  public Hook(Long id, boolean active) {
    this.id = id;
    this.active = active;
  }

  /**
   * @return The id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(Long id) {
    this.id = id;
  }

  public Hook withId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return The active
   */
  public boolean isActive() {
    return active;
  }

  /**
   * @param active The active
   */
  public void setActive(boolean active) {
    this.active = active;
  }

  public Hook withActive(boolean active) {
    this.active = active;
    return this;
  }

}
