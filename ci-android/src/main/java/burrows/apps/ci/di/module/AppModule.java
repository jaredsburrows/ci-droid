package burrows.apps.ci.di.module;


import android.app.Application;
import android.content.Context;
import burrows.apps.ci.rx.RxBus;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@Module
public class AppModule {
  private Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  @Provides @Singleton public Application provideApplication() {
    return this.application;
  }

  @Provides @Singleton public Context provideApplicationContext() {
    return this.application.getApplicationContext();
  }

  @Provides @Singleton public RxBus provideRxBus() {
    return new RxBus();
  }
}
