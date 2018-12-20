package im.vector.alpha;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import im.vector.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class widget_rps extends Fragment {


    public widget_rps() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_widget , container, false);

        return view;
    }

}


