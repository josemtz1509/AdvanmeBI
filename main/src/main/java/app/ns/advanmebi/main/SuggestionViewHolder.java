package app.ns.advanmebi.main;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SuggestionViewHolder extends RecyclerView.ViewHolder {

    public TextView Name;
    public ImageView Image;

    public SuggestionViewHolder(View itemView) {
        super(itemView);
        Name = itemView.findViewById(R.id.txtSuggestion);
        Image = itemView.findViewById(R.id.imgSuggestion);

    }
}
