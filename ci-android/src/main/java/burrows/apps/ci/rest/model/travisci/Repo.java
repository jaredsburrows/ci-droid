package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Repo {

  @SerializedName("id")
  @Expose
  private Long id;
  @SerializedName("slug")
  @Expose
  private String slug;
  @SerializedName("description")
  @Expose
  private String description;
  @SerializedName("last_build_id")
  @Expose
  private Long lastBuildId;
  @SerializedName("last_build_number")
  @Expose
  private String lastBuildNumber;
  @SerializedName("last_build_state")
  @Expose
  private String lastBuildState;
  @SerializedName("last_build_duration")
  @Expose
  private Long lastBuildDuration;
  @SerializedName("last_build_started_at")
  @Expose
  private String lastBuildStartedAt;
  @SerializedName("last_build_finished_at")
  @Expose
  private String lastBuildFinishedAt;
  @SerializedName("github_language")
  @Expose
  private String githubLanguage;

  /**
   * No args constructor for use in serialization
   */
  public Repo() {
  }

  /**
   * @param lastBuildFinishedAt
   * @param lastBuildDuration
   * @param lastBuildState
   * @param id
   * @param description
   * @param slug
   * @param lastBuildStartedAt
   * @param lastBuildNumber
   * @param lastBuildId
   * @param githubLanguage
   */
  public Repo(Long id, String slug, String description, Long lastBuildId, String lastBuildNumber, String lastBuildState, Long lastBuildDuration, String lastBuildStartedAt, String lastBuildFinishedAt, String githubLanguage) {
    this.id = id;
    this.slug = slug;
    this.description = description;
    this.lastBuildId = lastBuildId;
    this.lastBuildNumber = lastBuildNumber;
    this.lastBuildState = lastBuildState;
    this.lastBuildDuration = lastBuildDuration;
    this.lastBuildStartedAt = lastBuildStartedAt;
    this.lastBuildFinishedAt = lastBuildFinishedAt;
    this.githubLanguage = githubLanguage;
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

  public Repo withId(Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return The slug
   */
  public String getSlug() {
    return slug;
  }

  /**
   * @param slug The slug
   */
  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Repo withSlug(String slug) {
    this.slug = slug;
    return this;
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

  public Repo withDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * @return The lastBuildId
   */
  public Long getLastBuildId() {
    return lastBuildId;
  }

  /**
   * @param lastBuildId The last_build_id
   */
  public void setLastBuildId(Long lastBuildId) {
    this.lastBuildId = lastBuildId;
  }

  public Repo withLastBuildId(Long lastBuildId) {
    this.lastBuildId = lastBuildId;
    return this;
  }

  /**
   * @return The lastBuildNumber
   */
  public String getLastBuildNumber() {
    return lastBuildNumber;
  }

  /**
   * @param lastBuildNumber The last_build_number
   */
  public void setLastBuildNumber(String lastBuildNumber) {
    this.lastBuildNumber = lastBuildNumber;
  }

  public Repo withLastBuildNumber(String lastBuildNumber) {
    this.lastBuildNumber = lastBuildNumber;
    return this;
  }

  /**
   * @return The lastBuildState
   */
  public String getLastBuildState() {
    return lastBuildState;
  }

  /**
   * @param lastBuildState The last_build_state
   */
  public void setLastBuildState(String lastBuildState) {
    this.lastBuildState = lastBuildState;
  }

  public Repo withLastBuildState(String lastBuildState) {
    this.lastBuildState = lastBuildState;
    return this;
  }

  /**
   * @return The lastBuildDuration
   */
  public Long getLastBuildDuration() {
    return lastBuildDuration;
  }

  /**
   * @param lastBuildDuration The last_build_duration
   */
  public void setLastBuildDuration(Long lastBuildDuration) {
    this.lastBuildDuration = lastBuildDuration;
  }

  public Repo withLastBuildDuration(Long lastBuildDuration) {
    this.lastBuildDuration = lastBuildDuration;
    return this;
  }

  /**
   * @return The lastBuildStartedAt
   */
  public String getLastBuildStartedAt() {
    return lastBuildStartedAt;
  }

  /**
   * @param lastBuildStartedAt The last_build_started_at
   */
  public void setLastBuildStartedAt(String lastBuildStartedAt) {
    this.lastBuildStartedAt = lastBuildStartedAt;
  }

  public Repo withLastBuildStartedAt(String lastBuildStartedAt) {
    this.lastBuildStartedAt = lastBuildStartedAt;
    return this;
  }

  /**
   * @return The lastBuildFinishedAt
   */
  public String getLastBuildFinishedAt() {
    return lastBuildFinishedAt;
  }

  /**
   * @param lastBuildFinishedAt The last_build_finished_at
   */
  public void setLastBuildFinishedAt(String lastBuildFinishedAt) {
    this.lastBuildFinishedAt = lastBuildFinishedAt;
  }

  public Repo withLastBuildFinishedAt(String lastBuildFinishedAt) {
    this.lastBuildFinishedAt = lastBuildFinishedAt;
    return this;
  }

  /**
   * @return The githubLanguage
   */
  public String getGithubLanguage() {
    return githubLanguage;
  }

  /**
   * @param githubLanguage The github_language
   */
  public void setGithubLanguage(String githubLanguage) {
    this.githubLanguage = githubLanguage;
  }

  public Repo withGithubLanguage(String githubLanguage) {
    this.githubLanguage = githubLanguage;
    return this;
  }

}
