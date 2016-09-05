package burrows.apps.ci.rest.model.response;

import burrows.apps.ci.rest.model.Account;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

/**
 * GET /accounts HTTP/1.1
 * User-Agent: MyClient/1.0.0
 * Accept: application/vnd.travis-ci.2+json
 * Host: api.travis-ci.org
 * Authorization: token "YOUR TRAVIS ACCESS TOKEN"
 * HTTP/1.1 200 OK
 * Content-Type: application/json
 * <p>
 * {
 * "accounts" : [
 * {
 * "repos_count" : 167,
 * "name" : "Konstantin Haase",
 * "type" : "user",
 * "id" : 267,
 * "login" : "rkh"
 * },
 * {
 * "repos_count" : 70,
 * "name" : "Travis CI",
 * "type" : "organization",
 * "id" : 87,
 * "login" : "travis-ci"
 * }
 * ]
 * }
 *
 * @see <a href="https://docs.travis-ci.com/api#accounts">https://docs.travis-ci.com/api#accounts</a>
 */
@Generated("org.jsonschema2pojo")
public class AccountResponse {
  @SerializedName("accounts") @Expose private List<Account> accounts = new ArrayList<Account>();

  /**
   * No args constructor for use in serialization
   */
  public AccountResponse() {
  }

  /**
   * @param accounts
   */
  public AccountResponse(List<Account> accounts) {
    this.accounts = accounts;
  }

  /**
   * @return The accounts
   */
  public List<Account> getAccounts() {
    return accounts;
  }

  /**
   * @param accounts The accounts
   */
  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }

  public AccountResponse withAccounts(List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }
}
