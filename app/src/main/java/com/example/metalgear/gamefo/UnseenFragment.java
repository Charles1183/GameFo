package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class UnseenFragment extends Fragment {
    Button villageButton;
    Button cainhurstButton;
    Button abandonedButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_unseen, container, false);

        villageButton = (Button) view.findViewById(R.id.village_button);
        villageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), YahargalUnseenVillage.class);
                startActivity(defaultIntent);

            }
        });
        cainhurstButton = (Button) view.findViewById(R.id.cainhurst_button);
        cainhurstButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), ForsakenCastleCainhurst.class);
                startActivity(defaultIntent);

            }
        });
        abandonedButton = (Button) view.findViewById(R.id.abandoned_button);
        abandonedButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), AbandonedOldWorkshop.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
