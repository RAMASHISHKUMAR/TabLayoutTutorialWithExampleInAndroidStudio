package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.FirstFragment;
import fragment.SecondFragment;
import fragment.ThirdFragment;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumofTabs;

    public PagerAdapter(FragmentManager fm , int mNumofTabs) {
        super(fm);
        this.mNumofTabs = mNumofTabs;
    }



    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:
                FirstFragment tab1 = new FirstFragment();
                return tab1;
            case 1:
                SecondFragment tab2 = new SecondFragment();
                return tab2;
            case 2:
                ThirdFragment tab3 = new ThirdFragment();
                return tab3;

                default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNumofTabs;
    }
}
