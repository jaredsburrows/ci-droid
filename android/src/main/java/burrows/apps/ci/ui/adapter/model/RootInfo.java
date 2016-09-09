package burrows.apps.ci.ui.adapter.model;


import burrows.apps.ci.util.StringUtils;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class RootInfo {
  private String mName;
  private String mInfo;
  private String mVersion;

  /**
   * Returns true if has mName.
   *
   * @return True if has mName.
   */
  public boolean hasName() {
    return !StringUtils.isEmpty(this.mName);
  }

  /**
   * Get build mName.
   *
   * @return Build mName.
   */
  public String getName() {
    return this.mName;
  }

  /**
   * Set build mName.
   *
   * @param name Build mName.
   */
  public void setName(final String name) {
    this.mName = name;
  }

  /**
   * Returns with build mName.
   *
   * @param name Build mName.
   */
  public RootInfo withName(final String name) {
    this.mName = name;
    return this;
  }

  /**
   * Returns true if has mInfo.
   *
   * @return True if has mInfo.
   */
  public boolean hasInfo() {
    return !StringUtils.isEmpty(this.mInfo);
  }

  /**
   * Get build mInfo.
   *
   * @return Build mInfo.
   */
  public String getInfo() {
    return this.mInfo;
  }

  /**
   * Set build mInfo.
   *
   * @param info Build mInfo.
   */
  public void setInfo(final String info) {
    this.mInfo = info;
  }

  /**
   * Returns with build mInfo.
   *
   * @param info Build mInfo.
   */
  public RootInfo withInfo(final String info) {
    this.mInfo = info;
    return this;
  }

  /**
   * Returns true if has mVersion.
   *
   * @return True if has mVersion.
   */
  public boolean hasVersion() {
    return !StringUtils.isEmpty(this.mVersion);
  }

  /**
   * Get mVersion mName.
   *
   * @return Version mName.
   */
  public String getVersion() {
    return this.mVersion;
  }

  /**
   * Set build mVersion.
   *
   * @param version Build mVersion.
   */
  public void setVersion(final String version) {
    this.mVersion = version;
  }

  /**
   * Return build mVersion.
   *
   * @param version Build mVersion.
   */
  public RootInfo withVersion(final String version) {
    this.mVersion = version;
    return this;
  }
}
