package burrows.apps.ci.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SectionsPagerAdapter for ViewPager.
 *
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class SectionsPagerAdapter extends FragmentPagerAdapter {
  private Map<Integer, Fragment> fragments;
  private List<Integer> tabNumbers;
  private List<CharSequence> tabTitles;
  private int tabCount = 0;

  /**
   * Initiate the adapter with a {@link FragmentManager}.
   *
   * @param fragmentManager FragmentManager.
   */
  public SectionsPagerAdapter(FragmentManager fragmentManager) {
    super(fragmentManager);
    fragments = new HashMap<>();
    tabNumbers = new ArrayList<>();
    tabTitles = new ArrayList<>();
  }

  @Override public int getCount() {
    return fragments.size();
  }

  @Override public Fragment getItem(int position) {
    return fragments.get(tabNumbers.get(position));
  }

  @Override public CharSequence getPageTitle(int position) {
    return tabTitles.get(position);
  }

  /**
   * Add tab to adapter to be displayed by a {@link android.support.v4.view.ViewPager}.
   *
   * @param title    Title of Fragment.
   * @param fragment Instance of Fragment.
   * @return Updated instance of this adapter.
   */
  public SectionsPagerAdapter addTab(String title, Fragment fragment) {
    tabCount++;
    return addTab(title, fragment, tabCount);
  }

  /**
   * Add tab to adapter to be displayed by a {@link android.support.v4.view.ViewPager}.
   *
   * @param title     Title of Fragment.
   * @param fragment  Instance of Fragment.
   * @param tabNumber Position of Fragment.
   * @return Updated instance of this adapter.
   */
  public SectionsPagerAdapter addTab(String title, Fragment fragment, int tabNumber) {
    fragments.put(tabNumber, fragment);
    tabNumbers.add(tabNumber);
    tabTitles.add(title);

    notifyDataSetChanged();

    return this;
  }

  /**
   * Get Fragment based on position. Use this instead of {@link #getItem(int)} for
   * {@link Fragment} access.
   *
   * @param number Position of Fragment in the adapter.
   * @return Instance of fragment.
   * @see #getItem(int) Used by Fragment to get current instance.
   */
  public Fragment getTabFragment(int number) {
    return fragments.get(number);
  }
}
