package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class OldHuntersFragment extends Fragment {
    Button oldHuntersButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_old_hunters, container, false);

        oldHuntersButton = (Button) view.findViewById(R.id.old_hunters_button);
        oldHuntersButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), TheOldHunters.class);
                startActivity(defaultIntent);

            }
        });

        //other buttons go here

        return view;
    }
}
