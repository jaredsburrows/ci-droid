package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class EnvVar {

  @SerializedName("id")
  @Expose
  private String id;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("value")
  @Expose
  private String value;
  @SerializedName("public")
  @Expose
  private boolean _public;
  @SerializedName("repository_id")
  @Expose
  private Long repositoryId;

  /**
   * No args constructor for use in serialization
   */
  public EnvVar() {
  }

  /**
   * @param id
   * @param _public
   * @param name
   * @param value
   * @param repositoryId
   */
  public EnvVar(String id, String name, String value, boolean _public, Long repositoryId) {
    this.id = id;
    this.name = name;
    this.value = value;
    this._public = _public;
    this.repositoryId = repositoryId;
  }

  /**
   * @return The id
   */
  public String getId() {
    return id;
  }

  /**
   * @param id The id
   */
  public void setId(String id) {
    this.id = id;
  }

  public EnvVar withId(String id) {
    this.id = id;
    return this;
  }

  /**
   * @return The name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name The name
   */
  public void setName(String name) {
    this.name = name;
  }

  public EnvVar withName(String name) {
    this.name = name;
    return this;
  }

  /**
   * @return The value
   */
  public String getValue() {
    return value;
  }

  /**
   * @param value The value
   */
  public void setValue(String value) {
    this.value = value;
  }

  public EnvVar withValue(String value) {
    this.value = value;
    return this;
  }

  /**
   * @return The _public
   */
  public boolean isPublic() {
    return _public;
  }

  /**
   * @param _public The public
   */
  public void setPublic(boolean _public) {
    this._public = _public;
  }

  public EnvVar withPublic(boolean _public) {
    this._public = _public;
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

  public EnvVar withRepositoryId(Long repositoryId) {
    this.repositoryId = repositoryId;
    return this;
  }

}
