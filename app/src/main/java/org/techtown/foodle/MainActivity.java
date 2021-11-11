package org.techtown.foodle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
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