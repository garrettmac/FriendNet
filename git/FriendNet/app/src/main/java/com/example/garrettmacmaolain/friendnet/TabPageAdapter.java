package com.example.garrettmacmaolain.friendnet;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TabPageAdapter extends FragmentStatePagerAdapter {

    public TabPageAdapter(FragmentManager fm) {
        super(fm);
        // TODO Auto-generated constructor stub
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new Loc();
            case 1:
                //Fragment for Ios Tab
                return new Friends();
            case 2:
                //Fragment for Windows Tab
                return new Chat();
        }
        return null;
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return 3; //No of Tabs
    }
}