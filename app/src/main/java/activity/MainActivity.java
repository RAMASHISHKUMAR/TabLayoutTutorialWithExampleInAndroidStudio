package activity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;

import com.tablayoutexample.R;
import fragment.ThirdFragment;

import fragment.FirstFragment;
import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity {

    FrameLayout simpleFrameLayout;
    TabLayout tabLayout;
    private AlertDialog.Builder simpleViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleFrameLayout = findViewById(R.id.simpleFrameLayout);
        tabLayout = findViewById(R.id.simpleTabLayout);

        // Create new tab named "first"
        TabLayout.Tab firstTab = tabLayout.newTab();
        firstTab.setText("First");
        firstTab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(firstTab);

        // Create new tab named "second"
        TabLayout.Tab secondtab = tabLayout.newTab();
        secondtab.setText("second");
        secondtab.setIcon(R.drawable.ic_launcher_background);
        tabLayout.addTab(secondtab);

        // Create new tab named "third"
        TabLayout.Tab thirdtab = tabLayout.newTab();
        thirdtab.setText("third");
        thirdtab.setIcon(R.drawable.image1);
        tabLayout.addTab(thirdtab);



       tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               Fragment fragment = null;  //new Fragment();
               switch (tab.getPosition()) {
                   case 0:
                       fragment = new FirstFragment();
                       break;
                   case 1:
                       fragment = new SecondFragment();
                       break;
                   case 2:
                       fragment = new ThirdFragment();
                       break;
               }

               try {
                   FragmentManager fm = getSupportFragmentManager();
                   FragmentTransaction ft = fm.beginTransaction();
                   ft.add(R.id.simpleFrameLayout, fragment);
               ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                   ft.commit();
               }catch (Exception e){
                   e.printStackTrace();
               }

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {

           }
       });

    /*    PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        simpleViewPager.setAdapter(adapter);
// addOnPageChangeListener event change the tab on slide
        simpleViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));*/

    }
}
