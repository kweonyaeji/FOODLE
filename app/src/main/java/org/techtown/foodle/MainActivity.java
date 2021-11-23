package org.techtown.foodle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;


import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.action_menu, menu) ;
        return true;
    }

    MainFragment mainFragment;
    SearchFragment searchFragment;
    ChatFragment chatFragment;
    BasketFragment basketFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        searchFragment = new SearchFragment();
        chatFragment = new ChatFragment();
        basketFragment = new BasketFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
        BottomNavigationView bottom_menu = findViewById(R.id.bottom_menu);
        bottom_menu.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()) {
                    case R.id.first_tab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, mainFragment).commit();
                        return true;
                    case R.id.second_tab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, searchFragment).commit();
                        return true;
                    case R.id.third_tab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, chatFragment).commit();
                        return true;
                    case R.id.fourth_tab:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, basketFragment).commit();
                        return true;
                }
                return false;
            }
        });

    }

}