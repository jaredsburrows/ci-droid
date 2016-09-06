package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Request {

  @SerializedName("id")
  @Expose
  private Long id;
  @SerializedName("repository_id")
  @Expose
  private Long repositoryId;
  @SerializedName("commit_id")
  @Expose
  private Long commitId;
  @SerializedName("created_at")
  @Expose
  private String createdAt;
  @SerializedName("owner_id")
  @Expose
  private Long ownerId;
  @SerializedName("owner_type")
  @Expose
  private String ownerType;
  @SerializedName("event_type")
  @Expose
  private String eventType;
  @SerializedName("result")
  @Expose
  private String result;
  @SerializedName("pull_request")
  @Expose
  private boolean pullRequest;
  @SerializedName("branch")
  @Expose
  private String branch;

  /**
   * No args constructor for use in serialization
   */
  public Request() {
  }

  /**
   * @param id
   * @param result
   * @param ownerId
   * @param createdAt
   * @param ownerType
   * @param commitId
   * @param branch
   * @param pullRequest
   * @param eventType
   * @param repositoryId
   */
  public Request(Long id, Long repositoryId, Long commitId, String createdAt, Long ownerId, String ownerType, String eventType, String result, boolean pullRequest, String branch) {
    this.id = id;
    this.repositoryId = repositoryId;
    this.commitId = commitId;
    this.createdAt = createdAt;
    this.ownerId = ownerId;
    this.ownerType = ownerType;
    this.eventType = eventType;
    this.result = result;
    this.pullRequest = pullRequest;
    this.branch = branch;
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

  public Request withId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return The repositoryId
   */
  public Long getRepositoryId() {
    return repositoryId;
  }

  /**
   * @param repositoryId The repository_id
   */
  public void setRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
  }

  public Request withRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

  /**
   * @return The commitId
   */
  public Long getCommitId() {
    return commitId;
  }

  /**
   * @param commitId The commit_id
   */
  public void setCommitId(Long commitId) {
    this.commitId = commitId;
  }

  public Request withCommitId(Long commitId) {
    this.commitId = commitId;
    return this;
  }

  /**
   * @return The createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }

  /**
   * @param createdAt The created_at
   */
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Request withCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * @return The ownerId
   */
  public Long getOwnerId() {
    return ownerId;
  }

  /**
   * @param ownerId The owner_id
   */
  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public Request withOwnerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * @return The ownerType
   */
  public String getOwnerType() {
    return ownerType;
  }

  /**
   * @param ownerType The owner_type
   */
  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }

  public Request withOwnerType(String ownerType) {
    this.ownerType = ownerType;
    return this;
  }

  /**
   * @return The eventType
   */
  public String getEventType() {
    return eventType;
  }

  /**
   * @param eventType The event_type
   */
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public Request withEventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * @return The result
   */
  public String getResult() {
    return result;
  }

  /**
   * @param result The result
   */
  public void setResult(String result) {
    this.result = result;
  }

  public Request withResult(String result) {
    this.result = result;
    return this;
  }

  /**
   * @return The pullRequest
   */
  public boolean isPullRequest() {
    return pullRequest;
  }

  /**
   * @param pullRequest The pull_request
   */
  public void setPullRequest(boolean pullRequest) {
    this.pullRequest = pullRequest;
  }

  public Request withPullRequest(boolean pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

  /**
   * @return The branch
   */
  public String getBranch() {
    return branch;
  }

  /**
   * @param branch The branch
   */
  public void setBranch(String branch) {
    this.branch = branch;
  }

  public Request withBranch(String branch) {
    this.branch = branch;
    return this;
  }

}
