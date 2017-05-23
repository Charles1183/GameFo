package com.example.metalgear.gamefo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class NightmareFragment extends Fragment {
    Button nightfrontButton;
    Button lectureButton;
    Button mensisButton;

    @Nullable
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view;
        view = inflater.inflate(R.layout.fragment_nightmare, container, false);

        nightfrontButton = (Button) view.findViewById(R.id.nightfront_button);
        nightfrontButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), NightmareFrontier.class);
                startActivity(defaultIntent);

            }
        });
        lectureButton = (Button) view.findViewById(R.id.lecture_button);
        lectureButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), LectureBuilding.class);
                startActivity(defaultIntent);

            }
        });
        mensisButton = (Button) view.findViewById(R.id.mensis_button);
        mensisButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent defaultIntent = new Intent(getActivity(), NightmareOfMensis.class);
                startActivity(defaultIntent);

            }
        });

        return view;
    }
}
