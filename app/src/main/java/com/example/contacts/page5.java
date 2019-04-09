package com.example.contacts;

import android.preference.PreferenceManager;
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

import android.widget.TextView;
import android.widget.Toast;

public class page5 extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);

        count = PreferenceManager.getDefaultSharedPreferences(this).getInt("shahar", 0);
    }

    public void like(View view) {
        count++;
        Toast.makeText(this, "liked " + count + " times!", Toast.LENGTH_SHORT).show();
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("shahar", count).commit();
    }
}

