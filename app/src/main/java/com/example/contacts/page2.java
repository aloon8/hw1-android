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

public class page2 extends AppCompatActivity {
    ImageButton btn;
    TextView clicks;
    int _score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btn = (ImageButton) findViewById(R.id.likeBtn);
        clicks = (TextView) findViewById(R.id.score);

        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                clicks.setText(++_score + " ");
            }
        });
    }
}
