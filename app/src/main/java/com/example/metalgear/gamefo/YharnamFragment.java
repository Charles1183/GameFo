package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class YharnamFragment extends Fragment {
    Button clinicButton;
    Button centralButton;
    Button wardButton;
    Button oldButton;
    Button healingButton;
    Button upperButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_yharnam, container, false);

        //clinicButton
        clinicButton = (Button) view.findViewById(R.id.clinic_button);
        clinicButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), IosefkasClinic.class);
                startActivity(defaultIntent);

            }
        });
        centralButton = (Button) view.findViewById(R.id.central_button);
        centralButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), CentralYharnam.class);
                startActivity(defaultIntent);

            }
        });
        //wardButton
        wardButton = (Button) view.findViewById(R.id.ward_button);
        wardButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), CathedralWard.class);
                startActivity(defaultIntent);

            }
        });
        //oldButton
        oldButton = (Button) view.findViewById(R.id.old_button);
        oldButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), OldYharnam.class);
                startActivity(defaultIntent);

            }
        });
        //healingButton
        healingButton = (Button) view.findViewById(R.id.healing_button);
        healingButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), HealingChurchWorkshop.class);
                startActivity(defaultIntent);

            }
        });
        //upperButton
        upperButton = (Button) view.findViewById(R.id.upper_button);
        upperButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), UpperCathedralWard.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
