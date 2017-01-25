package solutions.hedron.simple_store.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import solutions.hedron.simple_store.R;
import solutions.hedron.simple_store.models.CategoryItem;

/**
 * Created by armin on 25/01/2017.
 */

public class CategoryItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView mainImage;
    private TextView mainText;

    public CategoryItemViewHolder(View itemView) {
        super(itemView);

        this.mainImage = (ImageView)itemView.findViewById(R.id.mainImage);
        this.mainText = (TextView)itemView.findViewById(R.id.mainText);
    }

    public void updateUI(CategoryItem categoryItem){
        String uri = categoryItem.getItemImageUri();
        int resource = this.mainImage.getResources().getIdentifier(uri, null, mainImage.getContext().getPackageName());
        mainImage.setImageResource(resource);
        mainText.setText(categoryItem.getItemTitle());
    }
}
