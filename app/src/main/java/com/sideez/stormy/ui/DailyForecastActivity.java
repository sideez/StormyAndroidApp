/*
 * Copyright (c) 2015. Sideez Inc.
 */

package com.sideez.stormy.ui;

import android.app.ListActivity;
import android.os.Bundle;

import com.sideez.stormy.R;
import com.sideez.stormy.adapters.DayAdapter;
import com.sideez.stormy.weather.Day;

public class DailyForecastActivity extends ListActivity {

    private Day[] mDays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_forecast);

        DayAdapter adapter = new DayAdapter(this, mDays);
    }
}
