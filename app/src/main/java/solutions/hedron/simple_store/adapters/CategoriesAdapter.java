package solutions.hedron.simple_store.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import solutions.hedron.simple_store.R;
import solutions.hedron.simple_store.holders.CategoryItemViewHolder;
import solutions.hedron.simple_store.models.CategoryItem;

/**
 * Created by armin on 25/01/2017.
 */

public class CategoriesAdapter extends RecyclerView.Adapter<CategoryItemViewHolder> {
    private ArrayList<CategoryItem> categoryItems;

    public CategoriesAdapter(ArrayList<CategoryItem> categoryItems) {
        this.categoryItems = categoryItems;
    }

    @Override
    public int getItemCount() {
        return categoryItems.size();
    }

    @Override
    public void onBindViewHolder(CategoryItemViewHolder holder, int position) {
        final CategoryItem item = this.categoryItems.get(position);
        holder.updateUI(item);

        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                // Load Details Screen
            }
        });
    }

    @Override
    public CategoryItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View categoryItemCard = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_item, parent, false);
        return new CategoryItemViewHolder(categoryItemCard);
    }
}
