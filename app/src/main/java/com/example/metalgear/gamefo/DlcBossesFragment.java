package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DlcBossesFragment extends Fragment {
    Button dlcAButton;
    Button dlcBButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_dlc_bosses, container, false);

        //clinicButton
        dlcAButton = (Button) view.findViewById(R.id.dlcA_button);
        dlcAButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });
        dlcBButton = (Button) view.findViewById(R.id.dlcB_button);
        dlcBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
