package com.example.satriadimaspermana.viewpagertest;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Satria Dimas Permana on 7/13/2016.
 */
public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount) {
        super(fm);

        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TabSatu tabSatu = new TabSatu();
                return tabSatu;
            case 1:
                TabDua tabDua = new TabDua();
                return tabDua;
            case 2:
                TabTiga tabTiga = new TabTiga();
                return tabTiga;
            default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return this.tabCount;
    }
}
