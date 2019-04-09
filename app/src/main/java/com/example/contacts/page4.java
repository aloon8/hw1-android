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

import android.widget.Button;
import android.widget.TextView;

public class page4 extends AppCompatActivity {
    int _click=650;
    TextView like,unlike;
    Button B;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        B = (Button) findViewById(R.id.Like);
        like = (TextView) findViewById(R.id.textView3);
        unlike = (Button) findViewById(R.id.unLike);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                like.setText(++_click+"");
            }
        });
        unlike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(_click>0)
                    like.setText(--_click+"");
            }
        });
    }
}


