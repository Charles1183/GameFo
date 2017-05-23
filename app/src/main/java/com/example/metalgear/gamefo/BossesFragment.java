package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class BossesFragment extends Fragment {
    Button bossAButton;
    Button bossBButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_bosses, container, false);

        //clinicButton
        bossAButton = (Button) view.findViewById(R.id.bossA_button);
        bossAButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });
        bossBButton = (Button) view.findViewById(R.id.bossB_button);
        bossBButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Test.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
