package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#logs">https://docs.travis-ci.com/api?http#logs</a>
 */
@Generated("org.jsonschema2pojo")
public class Log {
  @SerializedName("id")     @Expose private Long id;
  @SerializedName("job_id") @Expose private Long jobId;
  @SerializedName("body")   @Expose private String body;

  public Log() { }
  public Log(Long id, Long jobId, String body) {
    this.id = id;
    this.jobId = jobId;
    this.body = body;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Log withId(Long id) { this.id = id; return this; }

  public Long getJobId() { return jobId; }
  public void setJobId(Long jobId) { this.jobId = jobId; }
  public Log withJobId(Long jobId) { this.jobId = jobId; return this; }

  public String getBody() { return body; }
  public void setBody(String body) { this.body = body; }
  public Log withBody(String body) { this.body = body; return this; }
}
