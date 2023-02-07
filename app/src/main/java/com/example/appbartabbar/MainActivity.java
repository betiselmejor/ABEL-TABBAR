package com.example.appbartabbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Spinner;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Spinner cmbToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tbar = findViewById(R.id.appbar);
        setSupportActionBar(tbar);

        /*
        // Code for filters in the app bar
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        cmbToolbar = findViewById(R.id.cmbToolbar);
        String[] datos = {"Opción 1", "Opción 2", "Opción 3"};
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<>(this, R.layout.appbar_filter_title, datos);
        adaptador.setDropDownViewResource(
                R.layout.appbar_filter_list);
        cmbToolbar.setAdapter(adaptador);
        cmbToolbar.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //... Actions when no item is selected
            }
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //... Actions when an item is selected from the list
                Log.i("Appbar 3", "Selected option " + position);
            }
        });
        */

        // Code for Tabs
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new MiFragmentPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.appbartabs);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
    }
}

