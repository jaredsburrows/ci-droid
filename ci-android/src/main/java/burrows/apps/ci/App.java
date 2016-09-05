package burrows.apps.ci;

import android.app.Application;
import android.content.Context;
import android.os.StrictMode;
import android.support.v7.app.AppCompatDelegate;
import burrows.apps.ci.di.component.AppComponent;
import burrows.apps.ci.di.component.DaggerAppComponent;
import burrows.apps.ci.di.component.DaggerNetComponent;
import burrows.apps.ci.di.component.NetComponent;
import burrows.apps.ci.di.module.AppModule;
import burrows.apps.ci.di.module.NetModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public class App extends Application {
  private RefWatcher refWatcher;
  private AppComponent appComponent;
  private NetComponent netComponent;

  @Override public void onCreate() {
    super.onCreate();

    // Let's start paying critical attention to issues via Logcat
    if (BuildConfig.DEBUG) {
      StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder()
        .detectAll()
        .penaltyLog()
        .build());
      StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder()
        .detectAll()
        .penaltyLog()
        .build());
    }

    // Initialize LeakCanary for memory analysis, removed on release
    refWatcher = LeakCanary.install(this);

    AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
  }

  public static App get(final Context context) {
    return (App) context.getApplicationContext();
  }

  public AppComponent createAppComponent(final Application application) {
    appComponent = DaggerAppComponent.builder()
                                     .appModule(new AppModule(application))
                                     .build();
    return appComponent;
  }
  public AppComponent getAppComponent() {
    return appComponent;
  }

  public NetComponent createNetComponent() {
    netComponent = DaggerNetComponent.builder()
                                     .netModule(new NetModule())
                                     .build();
    return netComponent;
  }
  public NetComponent getNetComponent() {
    return netComponent;
  }

  /**
   * Use this method to watch the reference to context in onDestroy methods.
   *
   * @param context Context.
   * @return Instance of RefWatcher.
   */
  public static RefWatcher getRefWatcher(final Context context) {
    return ((App) context.getApplicationContext()).refWatcher;
  }
}
