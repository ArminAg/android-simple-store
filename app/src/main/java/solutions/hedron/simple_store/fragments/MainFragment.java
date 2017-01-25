package solutions.hedron.simple_store.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import solutions.hedron.simple_store.R;

public class MainFragment extends Fragment {
    public MainFragment() {
        // Required empty public constructor
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        // Add Games Category
        fragmentManager
                .beginTransaction()
                .add(R.id.containerTopRow, CategoryFragment.newInstance(CategoryFragment.CATEGORY_TYPE_GAMES))
                .commit();

        // Add Productivity Category
        fragmentManager
                .beginTransaction()
                .add(R.id.containerMiddleRow, CategoryFragment.newInstance(CategoryFragment.CATEGORY_TYPE_PRODUCTIVITY))
                .commit();

        // Add Health Category
        fragmentManager
                .beginTransaction()
                .add(R.id.containerBottomRow, CategoryFragment.newInstance(CategoryFragment.CATEGORY_TYPE_HEALTH))
                .commit();

        return view;
    }

}
