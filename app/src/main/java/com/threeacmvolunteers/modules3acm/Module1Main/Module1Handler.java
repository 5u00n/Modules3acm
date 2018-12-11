package com.threeacmvolunteers.modules3acm.Module1Main;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.threeacmvolunteers.modules3acm.R;

public class Module1Handler extends AppCompatActivity implements View.OnClickListener {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mDrawerToggle;

    RelativeLayout drawerView;
    RelativeLayout mainView;

    TextView newsfeed,video,audio,ebook,share,about;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.handlerone_layout);

            FragmentNewsFeed nffA = new FragmentNewsFeed();
            FragmentManager fragmentManager4 = getFragmentManager();
            android.app.FragmentTransaction ft1 = fragmentManager4.beginTransaction().replace(R.id.container_main, nffA);
            ft1.commit();

        drawerView = (RelativeLayout) findViewById(R.id.drawerView);
        mainView = (RelativeLayout) findViewById(R.id.mainView);



        //buttons
        newsfeed =(TextView) findViewById(R.id.text_hmain_newsfeed);
        video =(TextView) findViewById(R.id.text_hmain_video);
        audio =(TextView) findViewById(R.id.text_hmain_audio);
        ebook =(TextView) findViewById(R.id.text_hmain_ebook);
        share=(TextView) findViewById(R.id.text_hmain_share);
        about =(TextView) findViewById(R.id.text_hmain_about);



        //Button call
        newsfeed.setOnClickListener(this);
        video.setOnClickListener(this);
        audio.setOnClickListener(this);
        ebook.setOnClickListener(this);
        share.setOnClickListener(this);
        about.setOnClickListener(this);

       /* mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout) ;
        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.logo, R.string.app_name, R.string.app_name) {
            public void onDrawerClosed(View view) {
                supportInvalidateOptionsMenu();
            }

            public void onDrawerOpened(View drawerView) {
                supportInvalidateOptionsMenu();
            }

            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {
                super.onDrawerSlide(drawerView, slideOffset);
                mainView.setTranslationX(slideOffset * drawerView.getWidth());
                mDrawerLayout.bringChildToFront(drawerView);
                mDrawerLayout.requestLayout();
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);*/
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_hmain_newsfeed:
                FragmentNewsFeed nffA = new FragmentNewsFeed();
                FragmentManager fragmentManager1 = getFragmentManager();
                android.app.FragmentTransaction ft1 = fragmentManager1.beginTransaction().replace(R.id.container_main, nffA);
                ft1.commit();
                break;

            case R.id.text_hmain_video:
                FragmentVideo nffb = new FragmentVideo();
                FragmentManager fragmentManager2 = getFragmentManager();
                android.app.FragmentTransaction ft2 = fragmentManager2.beginTransaction().replace(R.id.container_main, nffb);
                ft2.commit();
                break;

            case R.id.text_hmain_audio:
                FragmentAudio nffc = new FragmentAudio();
                FragmentManager fragmentManager3 = getFragmentManager();
                android.app.FragmentTransaction ft3 = fragmentManager3.beginTransaction().replace(R.id.container_main, nffc);
                ft3.commit();
                break;

            case R.id.text_hmain_ebook:
                FragmentEbook nffd = new FragmentEbook();
                FragmentManager fragmentManager4 = getFragmentManager();
                android.app.FragmentTransaction ft4 = fragmentManager4.beginTransaction().replace(R.id.container_main, nffd);
                ft4.commit();
                break;

            case R.id.text_hmain_share:
                FragmentShare nffe = new FragmentShare();
                FragmentManager fragmentManager5 = getFragmentManager();
                android.app.FragmentTransaction ft5 = fragmentManager5.beginTransaction().replace(R.id.container_main, nffe);
                ft5.commit();
                break;

            case R.id.text_hmain_about:
                FragmentAbout nfff = new FragmentAbout();
                FragmentManager fragmentManager6 = getFragmentManager();
                android.app.FragmentTransaction ft6 = fragmentManager6.beginTransaction().replace(R.id.container_main, nfff);
                ft6.commit();
                break;


                default:
                    FragmentNewsFeed nff = new FragmentNewsFeed();
                    FragmentManager fragmentManager = getFragmentManager();
                    android.app.FragmentTransaction ft = fragmentManager.beginTransaction().replace(R.id.container_main, nff);
                    ft.commit();

        }

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
