package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api#commits">https://docs.travis-ci.com/api#commits</a>
 */
@Generated("org.jsonschema2pojo")
public class Commit {
  @SerializedName("id")               @Expose private Long    id;
  @SerializedName("sha")              @Expose private String  sha;
  @SerializedName("branch")           @Expose private String  branch;
  @SerializedName("message")          @Expose private String  message;
  @SerializedName("committed_at")     @Expose private String  committedAt;
  @SerializedName("author_name")      @Expose private String  authorName;
  @SerializedName("author_email")     @Expose private String  authorEmail;
  @SerializedName("committer_name")   @Expose private String  committerName;
  @SerializedName("committer_email")  @Expose private String  committerEmail;
  @SerializedName("compare_url")      @Expose private String  compareUrl;

  public Commit() { }
  public Commit(Long id, String sha, String branch, String message, String committedAt, String authorName,
                String authorEmail, String committerName, String committerEmail, String compareUrl) {
    this.id = id;
    this.sha = sha;
    this.branch = branch;
    this.message = message;
    this.committedAt = committedAt;
    this.authorName = authorName;
    this.authorEmail = authorEmail;
    this.committerName = committerName;
    this.committerEmail = committerEmail;
    this.compareUrl = compareUrl;
  }

  public Long getId() { return id; }
  public void setId(Long id) { this.id = id; }
  public Commit withId(Long id) { this.id = id; return this; }

  public String getSha() { return sha; }
  public void setSha(String sha) { this.sha = sha; }
  public Commit withSha(String sha) { this.sha = sha; return this; }

  public String getBranch() { return branch; }
  public void setBranch(String branch) { this.branch = branch; }
  public Commit withBranch(String branch) { this.branch = branch; return this; }

  public String getMessage() { return message; }
  public void setMessage(String message) { this.message = message; }
  public Commit withMessage(String message) { this.message = message; return this; }

  public String getCommittedAt() { return committedAt; }
  public void setCommittedAt(String committedAt) { this.committedAt = committedAt; }
  public Commit withCommittedAt(String committedAt) { this.committedAt = committedAt; return this; }

  public String getAuthorName() { return authorName; }
  public void setAuthorName(String authorName) { this.authorName = authorName; }
  public Commit withAuthorName(String authorName) { this.authorName = authorName; return this; }

  public String getAuthorEmail() { return authorEmail; }
  public void setAuthorEmail(String authorEmail) { this.authorEmail = authorEmail; }
  public Commit withAuthorEmail(String authorEmail) { this.authorEmail = authorEmail; return this; }

  public String getCommitterName() { return committerName; }
  public void setCommitterName(String committerName) { this.committerName = committerName; }
  public Commit withCommitterName(String committerName) { this.committerName = committerName; return this; }

  public String getCommitterEmail() { return committerEmail; }
  public void setCommitterEmail(String committerEmail) { this.committerEmail = committerEmail; }
  public Commit withCommitterEmail(String committerEmail) { this.committerEmail = committerEmail; return this; }

  public String getCompareUrl() { return compareUrl; }
  public void setCompareUrl(String compareUrl) { this.compareUrl = compareUrl; }
  public Commit withCompareUrl(String compareUrl) { this.compareUrl = compareUrl; return this; }
}
