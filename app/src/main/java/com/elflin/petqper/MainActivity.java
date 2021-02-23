package com.elflin.petqper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationMenu;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView main_botnavbar;
    private FrameLayout main_framelayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
        setBottomNavBar();
    }

    private void setBottomNavBar() {
        this.main_botnavbar.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                if (item.getItemId() == R.id.menu_social)
                    selectedFragment = new SocialFragment();
                else if (item.getItemId() == R.id.menu_booking)
                    selectedFragment = new BookingFragment();
                else if (item.getItemId() == R.id.menu_myHotel)
                    selectedFragment = new HotelFragment();
                else if (item.getItemId() == R.id.menu_profile)
                    selectedFragment = new ProfileFragment();

                getSupportFragmentManager().beginTransaction().replace(R.id.main_framelayout, selectedFragment).commit();

                return true;
            }
        });
    }

    private void initComponent() {
        this.main_botnavbar = findViewById(R.id.main_botnavbar);
        this.getSupportFragmentManager().beginTransaction().replace(R.id.main_framelayout, new SocialFragment()).commit();

    }
}