package com.example.homework02_month03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getSupportFragmentManager().beginTransaction().add(R.id.main_fragment,new MainFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.main_fragment,MainFragment.class,null).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.second_fragment,SecondFragment.class,null).commit();
    }
}