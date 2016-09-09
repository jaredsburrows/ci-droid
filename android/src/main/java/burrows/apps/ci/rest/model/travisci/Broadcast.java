package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#broadcasts">https://docs.travis-ci.com/api?http#broadcasts</a>
 */
@Generated("org.jsonschema2pojo")
public class Broadcast {
  @SerializedName("id")       @Expose private Long      id;
  @SerializedName("message")  @Expose private String    message;

  public Broadcast() { }
  public Broadcast(Long id, String message) {
    this.id = id;
    this.message = message;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id;}
  public Broadcast withId(Long id) { this.id = id; return this; }

  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
  public Broadcast withMessage(String message) { this.message = message; return this; }
}
