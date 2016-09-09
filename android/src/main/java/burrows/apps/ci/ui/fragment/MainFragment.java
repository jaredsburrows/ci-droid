package burrows.apps.ci.ui.fragment;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import burrows.apps.ci.R;
import burrows.apps.ci.ui.adapter.SectionsPagerAdapter;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class MainFragment extends BaseFragment {
  @BindString(R.string.tab_branches) String branches;
  @BindString(R.string.tab_build_history) String buildHistory;
  @BindString(R.string.tab_pull_requests) String pullRequests;
  @BindView(R.id.view_pager) ViewPager viewPager;
  @BindView(R.id.tab_layout) TabLayout tabLayout;
  private Unbinder unbinder;

  @Override public int getLayoutResId() {
    return R.layout.fragment_main;
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);

    View view = inflater.inflate(getLayoutResId(), container, false);

    unbinder = ButterKnife.bind(this, view);

    // ViewPager for Tabs and FragmentPagerAdapter for ViewPager that holds the Fragments
    viewPager.setAdapter(new SectionsPagerAdapter(getChildFragmentManager())
      .addTab(branches, new Branches())
      .addTab(buildHistory, new BuildHistory())
      .addTab(pullRequests, new PullRequests()));
    viewPager.setOffscreenPageLimit(viewPager.getAdapter().getCount());

    // Tabs
    tabLayout.setupWithViewPager(viewPager);

    return view;
  }

  @Override public void onActivityCreated(Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    // Update Toolbar for Fragment
    setToolbarTitle(branches);
    setToolbarNavigationIcon(R.drawable.ic_menu_white_24dp);
  }

  @Override public void onDestroyView() {
    super.onDestroyView();

    unbinder.unbind();
  }
}
