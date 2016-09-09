package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#jobs">https://docs.travis-ci.com/api?http#jobs</a>
 */
@Generated("org.jsonschema2pojo")
public class Job {
  @SerializedName("id")                   @Expose private Long        id;
  @SerializedName("build_id")             @Expose private Long        buildId;
  @SerializedName("repository_id")        @Expose private Long        repositoryId;
  @SerializedName("commit_id")            @Expose private Long        commitId;
  @SerializedName("log_id")               @Expose private Long        logId;
  @SerializedName("number")               @Expose private Long        number;
  @SerializedName("config")               @Expose private Config      config;
  @SerializedName("state")                @Expose private String      state;
  @SerializedName("started_at")           @Expose private String      startedAt;
  @SerializedName("finished_at")          @Expose private String      finishedAt;
  @SerializedName("queue")                @Expose private String      queue;
  @SerializedName("allow_failure")        @Expose private Boolean     allowFailure;
  @SerializedName("annotation_ids")       @Expose private List<Long>  annotationIds = new ArrayList<>();

  public Job() { }
  public Job(Long id, Long buildId, Long repositoryId, Long commitId, Long logId, Long number, Config config,
             String state, String startedAt, String finishedAt, String queue, Boolean allowFailure,
             List<Long> annotationIds) {
    this.id = id;
    this.buildId = buildId;
    this.repositoryId = repositoryId;
    this.commitId = commitId;
    this.logId = logId;
    this.number = number;
    this.config = config;
    this.state = state;
    this.startedAt = startedAt;
    this.finishedAt = finishedAt;
    this.queue = queue;
    this.allowFailure = allowFailure;
    this.annotationIds = annotationIds;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Job withId(Long id) { this.id = id; return this; }

  public Long getBuildId() { return buildId; }
  public void setBuildId(Long buildId) { this.buildId = buildId; }
  public Job withBuildId(Long buildId) { this.buildId = buildId; return this; }

  public Long getRepositoryId() { return repositoryId; }
  public void setRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; }
  public Job withRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; return this; }

  public Long getCommitId() { return commitId; }
  public void setCommitId(Long commitId) { this.commitId = commitId; }
  public Job withCommitId(Long commitId) { this.commitId = commitId; return this; }

  public Long getLogId() { return logId; }
  public void setLogId(Long logId) { this.logId = logId; }
  public Job withLogId(Long logId) { this.logId = logId; return this; }

  public Long getNumber() { return number; }
  public void setNumer(Long number) { this.number = number; }
  public Job withNumber(Long number) { this.number = number; return this; }

  public Config getConfig() { return config; }
  public void setConfig(Config config) { this.config = config; }
  public Job withConfig(Config config) { this.config = config; return this; }

  public String getState() { return state; }
  public void setState(String state) { this.state = state; }
  public Job withState(String state) { this.state = state; return this; }

  public String getStartedAt() { return startedAt; }
  public void setStartedAt(String startedAt) { this.startedAt = startedAt; }
  public Job withStartedAt(String startedAt) { this.startedAt = startedAt; return this; }

  public String getFinishedAt() { return finishedAt; }
  public void setFinishedAt(String finishedAt) { this.finishedAt = finishedAt; }
  public Job withFinishedAt(String finishedAt) { this.finishedAt = finishedAt; return this; }

  public String getQueue() { return queue; }
  public void setQueue(String queue) { this.queue = queue; }
  public Job withQueue(String queue) { this.queue = queue; return this; }

  public Boolean getAllowFailure() { return allowFailure; }
  public void setAllowFailure(Boolean allowFailure) { this.allowFailure = allowFailure; }
  public Job withAllowFailure(Boolean allowFailure) { this.allowFailure = allowFailure; return this; }

  public List<Long> getAnnotationIds() { return annotationIds; }
  public void setAnnotationIds(List<Long> annotationIds) { this.annotationIds = annotationIds; }
  public Job withAnnotationIds(List<Long> annotationIds) { this.annotationIds = annotationIds; return this; }
}
