package au.com.softclient.navigationcomponent1.fragments.fragmentA;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import au.com.softclient.navigationcomponent1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link A1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class A1Fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public A1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment A1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static A1Fragment newInstance(String param1, String param2) {
        A1Fragment fragment = new A1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_a1, container, false);
        View view = inflater.inflate(R.layout.fragment_a1, container, false);

        // Find the button and set an OnClickListener
        view.findViewById(R.id.buttonA1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to FragmentA1
                NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.action_a1Fragment_to_a2Fragment);
                //navController.navigate(R.id.action_AFragment_to_a1Fragment, new NavOptions.Builder().setPopUpTo(R.id.fragment_a, true).build());

            }

        });

        return view;
    }
}