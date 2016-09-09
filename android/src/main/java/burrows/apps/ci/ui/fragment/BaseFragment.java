package burrows.apps.ci.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import burrows.apps.ci.App;
import burrows.apps.ci.R;
import rx.subscriptions.CompositeSubscription;
import android.support.v4.app.Fragment;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public abstract class BaseFragment extends Fragment {
  protected CompositeSubscription subscription;
  private static String TAG = BaseFragment.class.getSimpleName();

  /**
   * @return Layout Id for the Fragment.
   */
  public abstract int getLayoutResId();

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    subscription = new CompositeSubscription();

    setHasOptionsMenu(true);
  }

  @Override public void onStop() {
    subscription.unsubscribe();

    super.onStop();
  }

  @Override public void onDestroy() {
    super.onDestroy();

    App.getRefWatcher(getActivity()).watch(this, TAG);
  }

  public void setToolbarTitle(CharSequence title) {
    Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.tool_bar);
    if (toolbar != null) {
      toolbar.setTitle(title);
    }
  }

  public void setToolbarSubtitle(CharSequence subtitle) {
    Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.tool_bar);
    if (toolbar != null) {
      toolbar.setSubtitle(subtitle);
    }
  }

  public void setToolbarNavigationIcon(int resId) {
    Toolbar toolbar = (Toolbar) getActivity().findViewById(R.id.tool_bar);
    if (toolbar != null) {
      toolbar.setNavigationIcon(resId);
    }
  }

  public boolean hasArguments() {
    return getArguments() != null && !getArguments().isEmpty();
  }
}
