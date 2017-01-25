package solutions.hedron.simple_store.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import solutions.hedron.simple_store.R;
import solutions.hedron.simple_store.fragments.DetailsFragment;
import solutions.hedron.simple_store.fragments.MainFragment;
import solutions.hedron.simple_store.models.CategoryItem;

public class MainActivity extends AppCompatActivity {

    private static MainActivity mainActivity;

    public static MainActivity getMainActivity(){
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity){
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.setMainActivity(this);

        if (getSupportFragmentManager().findFragmentById(R.id.fragmentsContainer) == null) {
            loadMainScreen();
        }
    }

    public void loadMainScreen(){
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentsContainer, MainFragment.newInstance())
                .commit();
    }

    public void loadDetailsScreen(CategoryItem categoryItem){
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentsContainer, DetailsFragment.newInstance(categoryItem.getItemTitle(), categoryItem.getItemImageUri()))
                .addToBackStack(null)
                .commit();
    }
}
