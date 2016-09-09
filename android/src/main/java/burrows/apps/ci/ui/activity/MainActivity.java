package burrows.apps.ci.ui.activity;

import android.os.Bundle;
import burrows.apps.ci.App;
import burrows.apps.ci.R;
import burrows.apps.ci.rx.RxBus;
import burrows.apps.ci.ui.fragment.MainFragment;
import butterknife.ButterKnife;

import javax.inject.Inject;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MainActivity extends BaseActivity {
  @Inject RxBus bus;

  @Override public int getLayoutResId() {
    return R.layout.activity_main;
  }

  @Override protected void onCreate(final Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    App.get(this).getAppComponent().inject(this);

    ButterKnife.bind(this);

    if (savedInstanceState == null) {
      this.getSupportFragmentManager()
          .beginTransaction()
          .replace(R.id.content_frame, new MainFragment(), MainFragment.class.getSimpleName())
          .commit();
    }
  }
}
