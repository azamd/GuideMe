package com.esprit.guideme.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.esprit.guideme.R;
import com.esprit.guideme.entity.LoggedInUser;
import com.esprit.guideme.services.signupService;


public class MyprofileFragment extends Fragment{

    private static final String TAG = MyprofileFragment.class.getSimpleName();
    ImageView logout;
    ViewGroup root;
    TextView theartistname;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        this.root = (ViewGroup) inflater.inflate(R.layout.fragment_myprofile, container, false);
        this.theartistname = (TextView) this.root.findViewById(R.id.theartistname);
        CharSequence name = LoggedInUser.getInstance().getLoggedInUser().getFirstName() + " " +  LoggedInUser.getInstance().getLoggedInUser().getLastName();
        this.theartistname.setText(name);
        if(savedInstanceState == null){
            logout = root.findViewById(R.id.logout);
        }

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_profile_artist);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupService ss = new signupService(getActivity());
                ss.logout();
                Intent intent = new Intent(getActivity(), LoginActivity.class);// New activity
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                getActivity().finish(); // Call once you redirect to another activity
            }
        });
        return this.root;
    }
}
