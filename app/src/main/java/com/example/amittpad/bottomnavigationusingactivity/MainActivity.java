package com.example.amittpad.bottomnavigationusingactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RelativeLayout r1,r2,r3,r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r1 =(RelativeLayout)findViewById(R.id.r1);
        r2 =(RelativeLayout)findViewById(R.id.r2);
        r3 =(RelativeLayout)findViewById(R.id.r3);
        r4 =(RelativeLayout)findViewById(R.id.r4);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        //If you want to Shift animation then simply comment this line
        //Disable Shifted mode in bottom navigation
        BottomNavigationViewHelper.disableShiftMode(navigation);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {


                case R.id.navigation_home:
                    /*Intent intent1 = new Intent(MainActivity.this,OneActivity.class);
                    startActivity(intent1);*/
                    r1.setVisibility(View.VISIBLE);
                    r2.setVisibility(View.GONE);
                    r3.setVisibility(View.GONE);
                    r4.setVisibility(View.GONE);
                    return true;

                case R.id.navigation_dashboard:
                   /* Intent intent2 = new Intent(MainActivity.this,TwoActivity.class);
                    startActivity(intent2);*/
                    r1.setVisibility(View.GONE);
                    r2.setVisibility(View.VISIBLE);
                    r3.setVisibility(View.GONE);
                    r4.setVisibility(View.GONE);
                    return true;

                case R.id.navigation_notifications:
                    /*Intent intent3 = new Intent(MainActivity.this,ThreeActivity.class);
                    startActivity(intent3);*/
                    r1.setVisibility(View.GONE);
                    r2.setVisibility(View.GONE);
                    r3.setVisibility(View.VISIBLE);
                    r4.setVisibility(View.GONE);
                    return true;

                case R.id.navigation_cart:
                    /*Intent intent1 = new Intent(MainActivity.this,OneActivity.class);
                    startActivity(intent1);*/
                    r1.setVisibility(View.GONE);
                    r2.setVisibility(View.GONE);
                    r3.setVisibility(View.GONE);
                    r4.setVisibility(View.VISIBLE);

                    return true;
            }
            return false;
        }
    };



}
