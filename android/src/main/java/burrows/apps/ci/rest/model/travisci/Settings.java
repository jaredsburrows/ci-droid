package burrows.apps.ci.rest.model.travisci;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#settings:-general">https://docs.travis-ci.com/api?http#settings:-general</a>
 * @see <a href="https://docs.travis-ci.com/api?http#settings:-environment-variables">https://docs.travis-ci.com/api?http#settings:-environment-variables</a>
 * @see <a href="https://docs.travis-ci.com/api?http#settings:-ssh-key">https://docs.travis-ci.com/api?http#settings:-ssh-key</a>
 */
@Generated("org.jsonschema2pojo")
public class Settings {

  @SerializedName("builds_only_with_travis_yml")
  @Expose
  private boolean buildsOnlyWithTravisYml;
  @SerializedName("build_pushes")
  @Expose
  private boolean buildPushes;
  @SerializedName("build_pull_requests")
  @Expose
  private boolean buildPullRequests;
  @SerializedName("maximum_number_of_builds")
  @Expose
  private Long maximumNumberOfBuilds;

  /**
   * No args constructor for use in serialization
   */
  public Settings() {
  }

  /**
   * @param buildPullRequests
   * @param buildsOnlyWithTravisYml
   * @param maximumNumberOfBuilds
   * @param buildPushes
   */
  public Settings(boolean buildsOnlyWithTravisYml, boolean buildPushes, boolean buildPullRequests, Long maximumNumberOfBuilds) {
    this.buildsOnlyWithTravisYml = buildsOnlyWithTravisYml;
    this.buildPushes = buildPushes;
    this.buildPullRequests = buildPullRequests;
    this.maximumNumberOfBuilds = maximumNumberOfBuilds;
  }

  /**
   * @return The buildsOnlyWithTravisYml
   */
  public boolean isBuildsOnlyWithTravisYml() {
    return buildsOnlyWithTravisYml;
  }

  /**
   * @param buildsOnlyWithTravisYml The builds_only_with_travis_yml
   */
  public void setBuildsOnlyWithTravisYml(boolean buildsOnlyWithTravisYml) {
    this.buildsOnlyWithTravisYml = buildsOnlyWithTravisYml;
  }

  public Settings withBuildsOnlyWithTravisYml(boolean buildsOnlyWithTravisYml) {
    this.buildsOnlyWithTravisYml = buildsOnlyWithTravisYml;
    return this;
  }

  /**
   * @return The buildPushes
   */
  public boolean isBuildPushes() {
    return buildPushes;
  }

  /**
   * @param buildPushes The build_pushes
   */
  public void setBuildPushes(boolean buildPushes) {
    this.buildPushes = buildPushes;
  }

  public Settings withBuildPushes(boolean buildPushes) {
    this.buildPushes = buildPushes;
    return this;
  }

  /**
   * @return The buildPullRequests
   */
  public boolean isBuildPullRequests() {
    return buildPullRequests;
  }

  /**
   * @param buildPullRequests The build_pull_requests
   */
  public void setBuildPullRequests(boolean buildPullRequests) {
    this.buildPullRequests = buildPullRequests;
  }

  public Settings withBuildPullRequests(boolean buildPullRequests) {
    this.buildPullRequests = buildPullRequests;
    return this;
  }

  /**
   * @return The maximumNumberOfBuilds
   */
  public Long getMaximumNumberOfBuilds() {
    return maximumNumberOfBuilds;
  }

  /**
   * @param maximumNumberOfBuilds The maximum_number_of_builds
   */
  public void setMaximumNumberOfBuilds(Long maximumNumberOfBuilds) {
    this.maximumNumberOfBuilds = maximumNumberOfBuilds;
  }

  public Settings withMaximumNumberOfBuilds(Long maximumNumberOfBuilds) {
    this.maximumNumberOfBuilds = maximumNumberOfBuilds;
    return this;
  }

}
