package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class HinterFragment extends Fragment {
    Button hinterAButton;
    Button hinterBButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_hinter, container, false);

        //clinicButton
        hinterAButton = (Button) view.findViewById(R.id.hinterA_button);
        hinterAButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });
        hinterBButton = (Button) view.findViewById(R.id.hinterB_button);
        hinterBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
