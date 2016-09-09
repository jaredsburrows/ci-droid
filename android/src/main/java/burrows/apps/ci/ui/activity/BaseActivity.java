package burrows.apps.ci.ui.activity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import burrows.apps.ci.R;
import com.orhanobut.logger.Logger;
import io.doorbell.android.Doorbell;
import rx.subscriptions.CompositeSubscription;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public abstract class BaseActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
  protected CompositeSubscription subscription;
  protected DrawerLayout drawerLayout;
  protected NavigationView navigationView;
  protected AppBarLayout appBar;
  protected Toolbar toolbar;
  private static String TAG = BaseActivity.class.getSimpleName();
  private static int NAV_DRAWER_LAUNCH_DELAY = 250;
  private Handler navigationHandler = new Handler();
  private ActionBarDrawerToggle drawerToggle;

  /**
   * @return Layout Id for the Activity.
   */
  public abstract int getLayoutResId();

  @Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
    int itemId = menuItem.getItemId();
    onNavDrawerItemClicked(itemId);
    navigationView.setCheckedItem(itemId);
    closeNavDrawer();
    return true;
  }

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(getLayoutResId());

    subscription = new CompositeSubscription();

    drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    appBar = (AppBarLayout) findViewById(R.id.app_bar_layout);
    toolbar = (Toolbar) findViewById(R.id.tool_bar);
    navigationView = (NavigationView) findViewById(R.id.navigation_view);
  }

  // Must call this for drawer toggle to work correctly
  @Override protected void onPostCreate(Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);

    // Setup Toolbar
    try {
      if (toolbar != null) {
        setToolbarNavigationIcon(R.drawable.ic_menu_white_24dp);
        setSupportActionBar(toolbar);
      }
    } catch (Throwable e) {
      Logger.e(e, "Sadly, Robolectric blows up when this method is called.");
    }

    // Setup DrawerLayout
    if (drawerLayout != null && toolbar != null) {
      drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open,
        R.string.nav_close);
      drawerLayout.addDrawerListener(drawerToggle);
      // Sync the toggle state after onRestoreInstanceState has occurred.
      drawerToggle.syncState();
    }

    // Setup NavigationView
    if (navigationView != null) {
      navigationView.setNavigationItemSelectedListener(this);
      navigationView.setCheckedItem(R.id.menu_nav_home);
    }
  }

  @Override protected void onDestroy() {
    super.onDestroy();

    subscription.unsubscribe();
    navigationHandler.removeCallbacksAndMessages(null);
  }

  @Override public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    if (drawerLayout != null) {
      drawerToggle.onConfigurationChanged(newConfig);
    }
  }

  @Override public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.menu_activity_main, menu);

    // This is the share action provider - dropdown of share.
    MenuItem item = menu.findItem(R.id.menu_share_app);

    return super.onCreateOptionsMenu(menu);
  }

  @Override public boolean onOptionsItemSelected(MenuItem item) {
    // Pass the event to ActionBarDrawerToggle, if it returns
    // true, then it has handled the app icon touch event
    if (drawerLayout != null && drawerToggle.onOptionsItemSelected(item)) {
      return true;
    }

    switch (item.getItemId()) {
      case android.R.id.home:
        if (drawerLayout != null) {
          drawerLayout.openDrawer(GravityCompat.START);
          Logger.i("Drawer open");
        } else {
          finish();
        }
        return true;

      default:
        return super.onOptionsItemSelected(item);
    }
  }

  @Override public void onBackPressed() {
    if (isNavDrawerOpen()) {
      closeNavDrawer();
    } else {
      super.onBackPressed();
    }
  }

  public void setToolbarTitle(CharSequence title) {
    if (toolbar != null) {
      toolbar.setTitle(title);
    }
  }

  public void setToolbarSubtitle(CharSequence subtitle) {
    if (toolbar != null) {
      toolbar.setSubtitle(subtitle);
    }
  }

  public void setToolbarNavigationIcon(int resId) {
    if (toolbar != null) {
      toolbar.setNavigationIcon(resId);
    }
  }

  protected boolean isNavDrawerOpen() {
    return drawerLayout != null && drawerLayout.isDrawerOpen(GravityCompat.START);
  }

  protected void openNavDrawer() {
    if (drawerLayout != null) {
      drawerLayout.openDrawer(GravityCompat.START);
    }
  }

  protected void closeNavDrawer() {
    if (drawerLayout != null) {
      drawerLayout.closeDrawer(GravityCompat.START);
    }
  }

  private void onNavDrawerItemClicked(final int id) {
    navigationHandler.postDelayed(new Runnable() {
      @Override
      public void run() {
        goToNavDrawerItem(id);
      }
    }, NAV_DRAWER_LAUNCH_DELAY);
  }

  void goToNavDrawerItem(int id) {
    if (id == R.id.menu_app_settings) {
      Logger.i("Open Settings");

      // startActivity(new Intent(this, SettingsActivity.class));
    } else if (id == R.id.menu_send_feedback) {
      Logger.i("Send Feedback");

      new Doorbell(this,
        Integer.parseInt(getString(R.string.app_doorbell_io_app_id)),
        getString(R.string.app_doorbell_io_api_key))
        .setPoweredByVisibility(View.GONE)
        .show();
    } else {
      Logger.i("Close drawer");

      closeNavDrawer();
    }
  }
}
