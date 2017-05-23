package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FrontierFragment extends Fragment {
    Button woodsButton;
    Button byrgenButton;
    Button hemwickButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_frontier, container, false);

        woodsButton = (Button) view.findViewById(R.id.woods_button);
        woodsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), ForbiddenWoods.class);
                startActivity(defaultIntent);

            }
        });
        byrgenButton = (Button) view.findViewById(R.id.byrgen_button);
        byrgenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), Byrgenwerth.class);
                startActivity(defaultIntent);

            }
        });
        hemwickButton = (Button) view.findViewById(R.id.hemwick_button);
        hemwickButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), HemwickCharnelLane.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
