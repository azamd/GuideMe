package com.esprit.guideme.ui;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ProfileArtistAdapter extends FragmentPagerAdapter {

    private Context context;
    int totalTabs;

    public ProfileArtistAdapter(FragmentManager fm, Context context, int totalTabs){
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public int getCount() {
        return totalTabs;
    }

    public Fragment getItem(int position){
        switch(position){
            case 0:
                PostsArtistTabFragment worksTabFragment = new PostsArtistTabFragment();
                return worksTabFragment;
            case 1:
                AboutArtistTabFragment aboutArtistTabFragment = new AboutArtistTabFragment();
                return aboutArtistTabFragment;
            default:
                return null;
        }
    }
}
