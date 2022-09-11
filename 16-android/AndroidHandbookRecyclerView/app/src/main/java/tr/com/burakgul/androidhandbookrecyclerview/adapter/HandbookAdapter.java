package tr.com.burakgul.androidhandbookrecyclerview.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import lombok.RequiredArgsConstructor;
import tr.com.burakgul.androidhandbookrecyclerview.activity.DetailsActivity;
import tr.com.burakgul.androidhandbookrecyclerview.databinding.ContentBinding;
import tr.com.burakgul.androidhandbookrecyclerview.model.Concept;
import tr.com.burakgul.androidhandbookrecyclerview.util.ContextUtil;

@RequiredArgsConstructor
public class HandbookAdapter extends RecyclerView.Adapter<HandbookAdapter.HandbookViewHolder> {

    private final List<Concept> concepts;


    @NonNull
    @Override
    public HandbookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ContentBinding contentBinding = ContentBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new HandbookViewHolder(contentBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull HandbookViewHolder holder, int position) {
        holder.contentBinding.textView.setText(this.concepts.get(position).getTitle());
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(holder.itemView.getContext(), DetailsActivity.class);
            intent.putExtra("concept",this.concepts.get(position));
            ContextUtil.startActivityFromBinding(holder.contentBinding,intent);
        });
    }

    @Override
    public int getItemCount() {
        return this.concepts.size();
    }

    public class HandbookViewHolder extends RecyclerView.ViewHolder{

        private ContentBinding contentBinding;

        public HandbookViewHolder(ContentBinding contentBinding){
            super(contentBinding.getRoot());
            this.contentBinding = contentBinding;
        }
    }
}
