package burrows.apps.ci.ui.adapter;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import burrows.apps.ci.R;
import burrows.apps.ci.ui.adapter.model.RootInfo;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
public final class PageAdapter extends BaseAdapter<RootInfo, PageAdapter.PageViewHolder> {
  @Override public PageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    return new PageViewHolder(LayoutInflater.from(parent.getContext())
                                            .inflate(R.layout.recyclerview_list_item, parent, false));
  }

  @Override public void onBindViewHolder(PageViewHolder holder, int position) {
    RootInfo model = getItem(position);
    holder.itemName.setText(model.getName());
    holder.itemInfo.setText(model.getInfo());
    holder.itemView.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        // App.getBus().send(new ItemClickEvent(model));
      }
    });
  }

  final class PageViewHolder extends ViewHolder {
    @BindView(R.id.item_name) TextView itemName;
    @BindView(R.id.item_info) TextView itemInfo;

    PageViewHolder(View itemView) {
      super(itemView);

      ButterKnife.bind(this, itemView);
    }
  }
}
