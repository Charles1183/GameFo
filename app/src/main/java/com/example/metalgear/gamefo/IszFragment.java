package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class IszFragment extends Fragment {
    Button iszAButton;
    Button iszBButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_isz, container, false);

        //clinicButton
        iszAButton = (Button) view.findViewById(R.id.iszA_button);
        iszAButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });
        iszBButton = (Button) view.findViewById(R.id.iszB_button);
        iszBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
