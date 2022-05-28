package com.example.newsapp;

import static org.junit.Assert.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import org.junit.Test;

public class PagerAdapterTest extends AppCompatActivity {

    @Test
    public void zeroShouldReturnHomeFragment() {
        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 6);
        Object x = pagerAdapter.getItem(0);
        assertTrue(x instanceof HomeFragment);

    }

}