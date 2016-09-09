package burrows.apps.ci.rest.model.travisci.response;

import burrows.apps.ci.rest.model.travisci.Account;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://docs.travis-ci.com/api?http#accounts>https://docs.travis-ci.com/api?http#accounts</a>
 */
@Generated("org.jsonschema2pojo")
public class AccountsResponse {
  @SerializedName("accounts") @Expose private List<Account> accounts = new ArrayList<>();

  public AccountsResponse() { }
  public AccountsResponse(List<Account> accounts) { this.accounts = accounts; }

  public List<Account> getAccounts() { return accounts; }
  public void setAccounts(List<Account> accounts) { this.accounts = accounts; }
  public AccountsResponse withAccounts(List<Account> accounts) { this.accounts = accounts; return this; }
}
