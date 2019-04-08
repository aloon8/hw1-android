package com.example.contacts;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageButton;
import android.widget.TextView;

public class page3 extends AppCompatActivity {

    int         like_cnt = 0;
    ImageButton like_button;
    TextView    like_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);


        like_button = (ImageButton) findViewById(R.id.likebutton);
        like_view   = (TextView)    findViewById(R.id.like_text_view);

        like_button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                like_cnt++;
                like_view.setText(like_cnt + " ");

            }
        });

    }
}
