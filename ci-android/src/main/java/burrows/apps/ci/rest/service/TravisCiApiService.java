package burrows.apps.ci.rest.service;

import burrows.apps.ci.rest.model.travisci.Branch;
import burrows.apps.ci.rest.model.travisci.Repo;
import burrows.apps.ci.rest.model.travisci.request.GithubAuthRequest;
import burrows.apps.ci.rest.model.travisci.response.BranchesResponse;
import burrows.apps.ci.rest.model.travisci.response.GithubAuthResponse;
import okhttp3.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api">https://docs.travis-ci.com/api</a>
 */
public interface TravisCiApiService {
  // ------------------------------------------------------------------------------
  // Authentication - Github
  // ------------------------------------------------------------------------------
  @POST("/auth/github") GithubAuthResponse auth(@Body GithubAuthRequest request);

  // ------------------------------------------------------------------------------
  // Entities - Branches
  // ------------------------------------------------------------------------------
  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/branches */
  @GET("/repos/{repository.id}/branches") BranchesResponse getBranches(@Path("repository.id") long id);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions/branches */
  @GET("/repos/{repository.slug}/branches") BranchesResponse getBranches(@Path("repository.slug") String slug);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/branches/master */
  @GET("/repos/{repository.id}/branches/{branch}") Branch getBranch(@Path("repository.id") long id,
                                                                    @Path("branch") String branch);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions/branches/master */
  @GET("/repos/{repository.slug}/branches/{branch}") Branch getBranch(@Path("repository.slug") String slug,
                                                                      @Path("branch") String branch);

  // ------------------------------------------------------------------------------
  // Entities - Builds
  // ------------------------------------------------------------------------------
  // TODO no file?
  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/builds */
  @GET("/repos/{repository.id}/builds") BranchesResponse getBuilds(@Path("repository.id") long id);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions/builds */
  @GET("/repos/{repository.slug}/builds") BranchesResponse getBuilds(@Path("repository.slug") String slug);

  // TODO no file?
  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/builds?event_type=pull_request */
  @GET("/repos/{repository.id}/builds?event_type=pull_request") BranchesResponse getPullRequestBuilds(@Path("repository.id") long id);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions/builds?event_type=pull_request */
  @GET("/repos/{repository.slug}/builds?event_type=pull_request") BranchesResponse getPullRequestBuilds(@Path("repository.slug") String slug);

  // TODO no file?
  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/builds/97 */
  @GET("/repos/{repository.id}/builds/{build.id}") BranchesResponse getBuild(@Path("repository.id") long repoId,
                                                                             @Path("build.id") long id);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions/builds/138619493 */
  @GET("/repos/{repository.slug}/builds/{build.id}") BranchesResponse getBuild(@Path("repository.slug") String slug,
                                                                               @Path("build.id") long id);

  // TODO no file?
  /* curl -v -x POST -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/cancel */
  @POST("/builds/{build.id}/cancel") Response cancelBuild(@Path("build.id") long id);

  // TODO no file?
  /* curl -v -x POST -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284/restart */
  @POST("/builds/{build.id}/restart") Response restartBuild(@Path("build.id") long id);

  // ------------------------------------------------------------------------------
  // Entities - Logs
  // ------------------------------------------------------------------------------
  @GET("/jobs/{job.id}/log") String getLogRaw(@Path("job.id") long id);

  @GET("/logs/{log.id}") Response getLogs(@Path("log.id") long id);

  // ------------------------------------------------------------------------------
  // Entities - Repositories
  // ------------------------------------------------------------------------------
  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos */
  @GET("/repos") List<Repo> getRepos();

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos?=cs-interview-questions */
  @GET("/repos") List<Repo> getRepos(@Query("search") String search);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/1123284 */
  @GET("/repos/{repository.id}") Repo getRepo(@Path("repository.id") long id);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/jaredsburrows/cs-interview-questions */
  @GET("/repos/{repository.slug}") Repo getRepo(@Path("repository.slug") String slug);

  /* curl -v -H "Accept: application/vnd.travis-ci.2+json" \
  https://api.travis-ci.org/repos/member?=jaredsburrows */
  @GET("/repos") List<Repo> getUserRepos(@Query("member") String member);
}
