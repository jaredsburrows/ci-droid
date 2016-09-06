package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Cache {
  @SerializedName("repository_id")  @Expose private Long    repositoryId;
  @SerializedName("size")           @Expose private Long    size;
  @SerializedName("slug")           @Expose private String  slug;
  @SerializedName("branch")         @Expose private String  branch;
  @SerializedName("last_modified")  @Expose private String  lastModified;

  public Cache() { }
  public Cache(Long repositoryId, Long size, String slug, String branch, String lastModified) {
    this.repositoryId = repositoryId;
    this.size = size;
    this.slug = slug;
    this.branch = branch;
    this.lastModified = lastModified;
  }

  public Long getRepositoryId() { return repositoryId; }
  public void setRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; }
  public Cache withRepositoryId(Long repositoryId) { this.repositoryId = repositoryId; return this; }

  public Long getSize() { return size; }
  public void setSize(Long size) { this.size = size; }
  public Cache withSize(Long size) { this.size = size; return this; }

  public String getSlug() { return slug; }
  public void setSlug(String slug) { this.slug = slug; }
  public Cache withSlug(String slug) { this.slug = slug; return this; }

  public String getBranch() { return branch; }
  public void setBranch(String branch) { this.branch = branch; }
  public Cache withBranch(String branch) { this.branch = branch; return this; }

  public String getLastModified() { return lastModified; }
  public void setLastModified(String lastModified) { this.lastModified = lastModified; }
  public Cache withLastModified(String lastModified) { this.lastModified = lastModified; return this; }
}
