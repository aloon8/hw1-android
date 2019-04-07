package com.example.contacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void page1(View view) {

        Intent intent = new Intent(this,page1.class);
        startActivity(intent);
    }

    public void page2(View view) {

        Intent intent = new Intent(this,page2.class);
        startActivity(intent);
    }

    public void page3(View view) {

        Intent intent = new Intent(this,page3.class);
        startActivity(intent);
    }

    public void page4(View view) {

        Intent intent = new Intent(this,page4.class);
        startActivity(intent);
    }

    public void page5(View view) {

        Intent intent = new Intent(this,page5.class);
        startActivity(intent);
    }
}
