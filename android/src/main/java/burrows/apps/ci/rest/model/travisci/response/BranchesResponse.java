package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Branch;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#branches">https://docs.travis-ci.com/api?http#branches</a>
 */
@Generated("org.jsonschema2pojo")
public class BranchesResponse {
  @SerializedName("branches") @Expose private List<Branch> branches = new ArrayList<>();

  public BranchesResponse() { }
  public BranchesResponse(List<Branch> branches) { this.branches = branches; }

  public List<Branch> getBranches() { return branches; }
  public void setBranches(List<Branch> branches) { this.branches = branches; }
  public BranchesResponse withBranches(List<Branch> branches) { this.branches = branches; return this; }
}
