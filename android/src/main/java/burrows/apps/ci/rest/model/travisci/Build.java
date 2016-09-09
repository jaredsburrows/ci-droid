package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#builds">https://docs.travis-ci.com/api#builds</a>
 */
@Generated("org.jsonschema2pojo")
public class Build {
  @SerializedName("id")                   @Expose private Long        id;
  @SerializedName("repository_id")        @Expose private Long        repositoryId;
  @SerializedName("commit_id")            @Expose private Long        commitId;
  @SerializedName("number")               @Expose private String      number;
  @SerializedName("pull_request")         @Expose private Boolean     pullRequest;
  @SerializedName("pull_request_number")  @Expose private String      pullRequestNumber;
  @SerializedName("pull_request_title")   @Expose private String      pullRequestTitle;
  @SerializedName("config")               @Expose private Config      config;
  @SerializedName("state")                @Expose private String      state;
  @SerializedName("started_at")           @Expose private String      startedAt;
  @SerializedName("finished_at")          @Expose private String      finishedAt;
  @SerializedName("duration")             @Expose private Long        duration;
  @SerializedName("job_ids")              @Expose private List<Long>  jobIds = new ArrayList<>();

  public Build() { }
  public Build(String startedAt, Long id, Long repositoryId, Long commitId, String number, Boolean pullRequest,
               String pullRequestNumber, String pullRequestTitle, Config config, String state, String finishedAt,
               Long duration, List<Long> jobIds) {
    this.startedAt = startedAt;
    this.id = id;
    this.repositoryId = repositoryId;
    this.commitId = commitId;
    this.number = number;
    this.pullRequest = pullRequest;
    this.pullRequestNumber = pullRequestNumber;
    this.pullRequestTitle = pullRequestTitle;
    this.config = config;
    this.state = state;
    this.finishedAt = finishedAt;
    this.duration = duration;
    this.jobIds = jobIds;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Build withId(Long id) { this.id = id; return this; }

  public Long getCommitId() { return commitId; }
  public void setCommitId(Long commitId) { this.commitId = commitId; }
  public Build withCommitId(Long commitId) { this.commitId = commitId; return this; }

  public Config getConfig() { return config; }
  public void setConfig(Config config) { this.config = config; }
  public Build withConfig(Config config) { this.config = config; return this; }

  public Long getDuration() { return duration; }
  public void setDuration(Long duration) { this.duration = duration; }
  public Build withDuration(Long duration) { this.duration = duration; return this; }

  public String getFinishedAt() { return finishedAt; }
  public void setFinishedAt(String finishedAt) { this.finishedAt = finishedAt; }
  public Build withFinishedAt(String finishedAt) { this.finishedAt = finishedAt; return this; }

  public List<Long> getJobIds() { return jobIds; }
  public void setJobIds(List<Long> jobIds) { this.jobIds = jobIds; }
  public Build withJobIds(List<Long> jobIds) { this.jobIds = jobIds; return this; }

  public String getNumber() { return number; }
  public void setNumber(String number) { this.number = number; }
  public Build withNumber(String number) { this.number = number; return this; }

  public Boolean isPullRequest() { return pullRequest; }
  public void setPullRequest(Boolean pullRequest) { this.pullRequest = pullRequest; }
  public Build withPullRequest(Boolean pullRequest) { this.pullRequest = pullRequest; return this; }

  public String getPullRequestNumber() { return pullRequestNumber; }
  public void setPullRequestNumber(String pullRequestNumber) { this.pullRequestNumber = pullRequestNumber; }
  public Build withPullRequestNumber(String pullRequestNumber) { this.pullRequestNumber = pullRequestNumber; return this; }

  public String getPullRequestTitle() { return pullRequestTitle; }
  public void setPullRequestTitle(String pullRequestTitle) { this.pullRequestTitle = pullRequestTitle; }
  public Build withPullRequestTitle(String pullRequestTitle) { this.pullRequestTitle = pullRequestTitle; return this; }

  public Long getRepositoryId() { return repositoryId; }
  public void setRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; }
  public Build withRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; return this; }

  public String getStartedAt() { return startedAt; }
  public void setStartedAt(String startedAt) { this.startedAt = startedAt; }
  public Build withStartedAt(String startedAt) { this.startedAt = startedAt; return this; }

  public String getState() { return state; }
  public void setState(String state) { this.state = state; }
  public Build withState(String state) { this.state = state; return this; }
}
