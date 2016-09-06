package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#annotations>https://docs.travis-ci.com/api?http#annotations</a>
 */
@Generated("org.jsonschema2pojo")
public class Annotation {
  @SerializedName("id")           @Expose private Long    id;
  @SerializedName("job_id")       @Expose private Long    jobId;
  @SerializedName("description")  @Expose private String  description;
  @SerializedName("url")          @Expose private String  url;
  @SerializedName("status")       @Expose private String  status;

  public Annotation() { }
  public Annotation(Long id, Long jobId, String description, String url, String status) {
    this.id = id;
    this.jobId = jobId;
    this.description = description;
    this.url = url;
    this.status = status;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Annotation withId(Long id) { this.id = id; return this; }

  public Long getJobId() { return jobId; }
  public void setJobId(Long jobId) { this.jobId = jobId; }
  public Annotation withJobId(Long jobId) { this.jobId = jobId; return this; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }
  public Annotation withDescription(String description) { this.description = description; return this; }

  public String getUrl() { return url; }
  public void setUrl(String url) { this.url = url; }
  public Annotation withUrl(String url) { this.url = url; return this; }

  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }
  public Annotation withStatus(String status) { this.status = status; return this; }
}
