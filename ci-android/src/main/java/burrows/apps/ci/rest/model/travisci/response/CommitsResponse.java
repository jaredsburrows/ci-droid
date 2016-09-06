package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Build;
import burrows.apps.ci.rest.model.travisci.Commit;
import burrows.apps.ci.rest.model.travisci.Job;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api#commits">https://docs.travis-ci.com/api#commits</a>
 */
@Generated("org.jsonschema2pojo")
public class CommitsResponse {
  @SerializedName("builds")   @Expose private List<Build>   builds = new ArrayList<>();
  @SerializedName("jobs")     @Expose private List<Job>     jobs = new ArrayList<>();
  @SerializedName("commits")  @Expose private List<Commit>  commits = new ArrayList<>();

  public CommitsResponse() { }
  public CommitsResponse(List<Build> builds, List<Job> jobs, List<Commit> commits) {
    this.builds = builds;
    this.jobs = jobs;
    this.commits = commits;
  }

  public List<Build> getBuilds() {return builds; }
  public void setBuilds(List<Build> builds) { this.builds = builds; }
  public CommitsResponse withBuilds(List<Build> builds) { this.builds = builds; return this; }

  public List<Job> getJobs() { return jobs; }
  public void setJobs(List<Job> jobs) { this.jobs = jobs; }
  public CommitsResponse withJobs(List<Job> jobs) { this.jobs = jobs; return this; }

  public List<Commit> getCommits() {return commits; }
  public void setCommits(List<Commit> commits) { this.commits = commits; }
  public CommitsResponse withCommits(List<Commit> commits) { this.commits = commits; return this; }
}
