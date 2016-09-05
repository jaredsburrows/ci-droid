package burrows.apps.ci.di.component;

import android.app.Application;
import android.content.Context;
import burrows.apps.ci.di.module.AppModule;
import burrows.apps.ci.rx.RxBus;
import dagger.Component;

import javax.inject.Singleton;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
  Application application();
  Context applicationContext();
  RxBus rxBus();
}
