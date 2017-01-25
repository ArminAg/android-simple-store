package solutions.hedron.simple_store.models;

/**
 * Created by armin on 25/01/2017.
 */

public class CategoryItem {
    final String DRAWABLE = "drawable/";
    private String itemTitle;
    private String itemImageUri;

    public CategoryItem(String itemTitle, String itemImageUri) {
        this.itemTitle = itemTitle;
        this.itemImageUri = itemImageUri;
    }

    public String getItemTitle() {
        return DRAWABLE + itemTitle;
    }

    public String getItemImageUri() {
        return itemImageUri;
    }
}
