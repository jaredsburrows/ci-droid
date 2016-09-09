package burrows.apps.ci.di.component;

import burrows.apps.ci.di.module.AppModule;
import burrows.apps.ci.di.module.NetModule;
import burrows.apps.ci.rest.service.TravisCiApiService;
import dagger.Component;

import javax.inject.Singleton;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
  TravisCiApiService travisCiApiService();
}
