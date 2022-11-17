package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.myfirstapplication.R;

public class HomeFragment extends Fragment {

    CardView cv1;
    CardView cv2;
    CardView cv3;
    TextView nameofartist;
    ViewGroup root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.root = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);

        if(savedInstanceState == null){
            cv1 = root.findViewById(R.id.cardView1);
            cv2 = root.findViewById(R.id.cardView2);
            cv3 = root.findViewById(R.id.cardView3);
            nameofartist = root.findViewById(R.id.nameofartist);
        }

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PostDetailsActivity.class);
                startActivity(i);
            }
        });
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PostDetailsActivity.class);
                startActivity(i);
            }
        });
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PostDetailsActivity.class);
                startActivity(i);
            }
        });

        nameofartist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), ProfileArtistActivity.class);
                startActivity(intent);
            }
        });
        return this.root;
    }
}