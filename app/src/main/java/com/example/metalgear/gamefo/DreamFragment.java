package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class DreamFragment extends Fragment {
    Button dreamButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_dream, container, false);
        dreamButton = (Button) view.findViewById(R.id.huntersDream_button);
        dreamButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), HuntersDream.class);
                startActivity(defaultIntent);

            }
        });
        return view;
    }
}
