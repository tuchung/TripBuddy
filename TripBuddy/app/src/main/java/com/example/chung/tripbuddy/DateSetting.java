package com.example.chung.tripbuddy;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

/**
 * Created by Chung on 8/23/2015.
 */
public class DateSetting implements DatePickerDialog.OnDateSetListener {
    Context context;
    public DateSetting(Context context)
    {
        this.context = context;
    }
    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        Toast.makeText(context, "Select a date :" + monthOfYear + " / " + dayOfMonth + " / " + year, Toast.LENGTH_LONG).show();
    }
}
