package burrows.apps.ci.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import burrows.apps.ci.R;
import burrows.apps.ci.ui.adapter.PageAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class PullRequests extends BaseFragment {
  @BindView(R.id.recyclerview_build) RecyclerView recyclerView;
  PageAdapter adapter;
  private Unbinder unbinder;

  @Override public int getLayoutResId() {
    return R.layout.fragment_build;
  }

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    adapter = new PageAdapter();
  }

  @Override public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    super.onCreateView(inflater, container, savedInstanceState);

    // Root view
    View view = inflater.inflate(getLayoutResId(), container, false);

    unbinder = ButterKnife.bind(this, view);

    // List of data for view
    recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
    recyclerView.setItemAnimator(new DefaultItemAnimator());
    recyclerView.setAdapter(adapter);

    return view;
  }

  @Override public void onDestroyView() {
    super.onDestroyView();

    unbinder.unbind();
  }
}
