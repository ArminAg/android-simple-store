package solutions.hedron.simple_store.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import solutions.hedron.simple_store.R;
import solutions.hedron.simple_store.fragments.MainFragment;

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
}
