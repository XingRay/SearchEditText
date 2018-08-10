package com.leixing.searchedittext;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.leixing.lib.searchbar.OnSearchListener;
import com.leixing.lib.searchbar.SearchEditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SearchBar sbSearch = findViewById(R.id.sb_search);
        sbSearch.setAutoSearchEnable(true);
        sbSearch.setSearchDelayMills(2000);
        sbSearch.setOnSearchListener(new OnSearchListener() {
            @Override
            public void onSearch(SearchEditText.SearchTrigger trigger, String keyword) {
                Log.i(TAG, "trigger:" + trigger + " keyword" + keyword);
            }
        });
    }
}
