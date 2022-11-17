package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.esprit.guideme.R;

public class SearchFragment extends Fragment {
    CardView cv1;
    ViewGroup root;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        this.root = (ViewGroup) inflater.inflate(R.layout.fragment_search, container, false);
        if(savedInstanceState == null){
            cv1 = root.findViewById(R.id.cardView1);
        }

        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), PostDetailsActivity.class);
                startActivity(i);
            }
        });
        return this.root;
    }
}

