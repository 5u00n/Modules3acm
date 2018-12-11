package com.threeacmvolunteers.modules3acm.Module0;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.threeacmvolunteers.modules3acm.MainActivity;
import com.threeacmvolunteers.modules3acm.Module1Main.Module1Handler;
import com.threeacmvolunteers.modules3acm.R;

public class FragmentLogin  extends Fragment {

    int position;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState == null){
            // Get back arguments
            if(getArguments() != null) {
                position = getArguments().getInt("position", 0);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup parent, @Nullable Bundle savedInstanceState) {

        // Inflate the xml file for the fragment
        return inflater.inflate(R.layout.fragment_login, parent, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Set values for view here
        Button skipbutton = (Button)view.findViewById(R.id.button_loginpage_skip);


        skipbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(),Module1Handler.class));
                getActivity().finish();
            }
        });


    }

    // Activity is calling this to update view on Fragment
    public void updateView(int position){

    }
}
