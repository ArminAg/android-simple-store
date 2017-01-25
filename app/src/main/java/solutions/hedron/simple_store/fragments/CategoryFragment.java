package solutions.hedron.simple_store.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import solutions.hedron.simple_store.R;

public class CategoryFragment extends Fragment {

    private static final String ARG_CATEGORY_TYPE = "category_type";

    // Constants for store category types
    public static final int CATEGORY_TYPE_GAMES = 0;
    public static final int CATEGORY_TYPE_PRODUCTIVITY = 1;
    public static final int CATEGORY_TYPE_HEALTH = 2;

    private int categoryType;

    public CategoryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param categoryType Store Category Type.
     * @return A new instance of fragment CategoryFragment.
     */
    public static CategoryFragment newInstance(int categoryType) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_CATEGORY_TYPE, categoryType);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categoryType = getArguments().getInt(ARG_CATEGORY_TYPE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_category, container, false);
    }

}
