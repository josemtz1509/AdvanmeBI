package app.ns.advanmebi.main;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class SuggestionAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Suggestion> listSuggestion;

    public SuggestionAdapter(List<Suggestion> listSuggestion){
        this.listSuggestion = listSuggestion;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardview_result,parent,false);
        return new SuggestionViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Suggestion suggestion = listSuggestion.get(position);
        SuggestionViewHolder SuggestionHolder = (SuggestionViewHolder)holder;
        SuggestionHolder.Name.setText(suggestion.getName());
        if(context == null)
            holder.itemView.getContext();
    }

    @Override
    public int getItemCount() {
        return listSuggestion.size();
    }
}
