package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.EnvVar;
import burrows.apps.ci.rest.model.travisci.Settings;
import burrows.apps.ci.rest.model.travisci.SshKey;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#settings">https://docs.travis-ci.com/api#settings</a>
 */
@Generated("org.jsonschema2pojo")
public class SettingsResponse {
  @SerializedName("settings") @Expose private Settings      settings;
  @SerializedName("env_vars") @Expose private List<EnvVar>  envVars = new ArrayList<>();
  @SerializedName("ssh_key")  @Expose private SshKey        sshKey;

  public SettingsResponse() { }
  public SettingsResponse(Settings settings, List<EnvVar> envVars, SshKey sshKey) {
    this.settings = settings;
    this.envVars = envVars;
    this.sshKey = sshKey;
  }

  public Settings getSettings() { return settings; }
  public void setSettings(Settings settings) { this.settings = settings; }
  public SettingsResponse withSettings(Settings settings) { this.settings = settings; return this; }

  public List<EnvVar> getEnvVars() { return envVars; }
  public void setEnvVars(List<EnvVar> envVars) { this.envVars = envVars; }
  public SettingsResponse withEnvVars(List<EnvVar> envVars) {

  public SshKey getSshKey() { return sshKey; }
  public void setSshKey(SshKey sshKey) { this.sshKey = sshKey; }
  public SettingsResponse withSshKey(SshKey sshKey) {this.sshKey = sshKey; return this; }
}
