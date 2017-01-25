package solutions.hedron.simple_store.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import solutions.hedron.simple_store.R;

public class DetailsFragment extends Fragment {
    private static final String ARG_ITEM_TITLE = "item_title";
    private static final String ARG_ITEM_IMAGE_URI = "item_image_uri";

    private String itemTitle;
    private String itemImageUri;


    public DetailsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param itemTitle Parameter 1.
     * @param itemImageUri Parameter 2.
     * @return A new instance of fragment DetailsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailsFragment newInstance(String itemTitle, String itemImageUri) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_ITEM_TITLE, itemTitle);
        args.putString(ARG_ITEM_IMAGE_URI, itemImageUri);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            itemTitle = getArguments().getString(ARG_ITEM_TITLE);
            itemImageUri = getArguments().getString(ARG_ITEM_IMAGE_URI);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        ImageView itemImageView = (ImageView)view.findViewById(R.id.itemImageView);
        TextView itemTextView = (TextView)view.findViewById(R.id.itemTextView);

        int resource = itemImageView.getResources().getIdentifier(itemImageUri, null, itemImageView.getContext().getPackageName());
        itemImageView.setImageResource(resource);
        itemTextView.setText(itemTitle);
        return view;
    }

}
