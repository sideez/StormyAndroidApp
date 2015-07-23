/*
 * Copyright (c) 2015. Sideez Inc.
 */

package com.sideez.stormy.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sideez.stormy.R;
import com.sideez.stormy.weather.Day;

/**
 * Created by sideez on 2015-07-22.
 */
public class DayAdapter extends BaseAdapter {

    private Context mContext;
    private Day[] mDays;

    public DayAdapter(Context context, Day[] days) {
        mContext = context;
        mDays = days;
    }

    @Override
    public int getCount() {
        return mDays.length;
    }

    @Override
    public Object getItem(int position) {
        return mDays[position];
    }

    @Override
    public long getItemId(int position) {
        return 0; // Not using this. This tag items for easy reference.
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if (convertView == null) {
            // brand new view
            convertView = LayoutInflater.from(mContext).inflate(R.layout.daily_list_item, null);
            viewHolder = new ViewHolder();
            viewHolder.iconImageView = (ImageView) convertView.findViewById(R.id.iconImageView);
            viewHolder.temperatureLabel = (TextView) convertView.findViewById(R.id.temperatureLabel);
            viewHolder.dayLabel = (TextView) convertView.findViewById(R.id.dayNameLabel);

            convertView.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        Day day = mDays[position];

        viewHolder.iconImageView.setImageResource(day.getIconId());
        viewHolder.temperatureLabel.setText(day.getTemperatureMax() + "");

        if (position == 0) {
            viewHolder.dayLabel.setText("Today");
        }
        else {
            viewHolder.dayLabel.setText(day.getDayOfTheWeek());
        }

        return convertView;
    }

    private static class ViewHolder {
        ImageView iconImageView; // public by default
        TextView temperatureLabel;
        TextView dayLabel;
    }
}
