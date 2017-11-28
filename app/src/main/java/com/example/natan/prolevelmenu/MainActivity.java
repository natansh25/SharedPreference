package com.example.natan.prolevelmenu;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLayout=findViewById(R.id.layout);
        show();




    }

    private void show()
    {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        red(sharedPreferences.getBoolean("RED",true));

    }


    private void red(boolean ans)
    {
        if(ans==true)
        {
            mLayout.setBackgroundColor(Color.parseColor("#E91E63"));
        }
        else
        {
            mLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
    }


    public void blue(boolean ans)
    {
        if(ans==true)
        {
            mLayout.setBackgroundColor(Color.parseColor("#AA00FF"));
        }
        else
        {
            mLayout.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())
        {
            case R.id.setting:
                Intent i=new Intent(this,Settings.class);
                startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }
}
