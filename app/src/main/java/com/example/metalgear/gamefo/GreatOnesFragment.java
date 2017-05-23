package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class GreatOnesFragment extends Fragment {
    Button greatAButton;
    Button greatBButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_great_ones, container, false);

        //clinicButton
        greatAButton = (Button) view.findViewById(R.id.greatA_button);
        greatAButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });
        greatBButton = (Button) view.findViewById(R.id.greatB_button);
        greatBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
