package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#repositories">https://docs.travis-ci.com/api?http#repositories</a>
 */
@Generated("org.jsonschema2pojo")
public class Repository {
  @SerializedName("id")                     @Expose private Long    id;
  @SerializedName("slug")                   @Expose private String  slug;
  @SerializedName("description")            @Expose private String  description;
  @SerializedName("last_build_id")          @Expose private Long    lastBuildId;
  @SerializedName("last_build_number")      @Expose private String  lastBuildNumber;
  @SerializedName("last_build_state")       @Expose private String  lastBuildState;
  @SerializedName("last_build_duration")    @Expose private Long    lastBuildDuration;
  @SerializedName("last_build_started_at")  @Expose private String  lastBuildStartedAt;
  @SerializedName("last_build_finished_at") @Expose private String  lastBuildFinishedAt;
  @SerializedName("github_language")        @Expose private String  githubLanguage;

  public Repository() { }
  public Repository(Long id, String slug, String description, Long lastBuildId, String lastBuildNumber,
                    String lastBuildState, Long lastBuildDuration, String lastBuildStartedAt,
                    String lastBuildFinishedAt, String githubLanguage) {
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

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Repository withId(Long id) { this.id = id; return this; }

  public String getSlug() { return slug; }
  public void setSlug(String slug) { this.slug = slug; }
  public Repository withSlug(String slug) { this.slug = slug; return this; }

  public String getDescription() { return description; }
  public void setDescription(String description) { this.description = description; }
  public Repository withDescription(String description) { this.description = description; return this; }

  public Long getLastBuildId() { return lastBuildId; }
  public void setLastBuildId(Long lastBuildId) { this.lastBuildId = lastBuildId; }
  public Repository withLastBuildId(Long lastBuildId) { this.lastBuildId = lastBuildId; return this; }

  public String getLastBuildNumber() { return lastBuildNumber; }
  public void setLastBuildNumber(String lastBuildNumber) { this.lastBuildNumber = lastBuildNumber; }
  public Repository withLastBuildNumber(String lastBuildNumber) { this.lastBuildNumber = lastBuildNumber; return this; }

  public String getLastBuildState() { return lastBuildState; }
  public void setLastBuildState(String lastBuildState) { this.lastBuildState = lastBuildState; }
  public Repository withLastBuildState(String lastBuildState) { this.lastBuildState = lastBuildState; return this; }

  public Long getLastBuildDuration() { return lastBuildDuration; }
  public void setLastBuildDuration(Long lastBuildDuration) { this.lastBuildDuration = lastBuildDuration; }
  public Repository withLastBuildDuration(Long lastBuildDuration) { this.lastBuildDuration = lastBuildDuration; return this; }

  public String getLastBuildStartedAt() { return lastBuildStartedAt; }
  public void setLastBuildStartedAt(String lastBuildStartedAt) { this.lastBuildStartedAt = lastBuildStartedAt; }
  public Repository withLastBuildStartedAt(String lastBuildStartedAt) { this.lastBuildStartedAt = lastBuildStartedAt; return this; }

  public String getLastBuildFinishedAt() { return lastBuildFinishedAt; }
  public void setLastBuildFinishedAt(String lastBuildFinishedAt) { this.lastBuildFinishedAt = lastBuildFinishedAt; }
  public Repository withLastBuildFinishedAt(String lastBuildFinishedAt) { this.lastBuildFinishedAt = lastBuildFinishedAt; return this; }

  public String getGithubLanguage() { return githubLanguage; }
  public void setGithubLanguage(String githubLanguage) { this.githubLanguage = githubLanguage; }
  public Repository withGithubLanguage(String githubLanguage) { this.githubLanguage = githubLanguage; return this; }
}
