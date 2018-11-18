package com.example.ages.portocredapp;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;


import static com.example.ages.portocredapp.R.layout.activity_extrato;

public class Extrato extends AppCompatActivity {
private CalendarView calendarView;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_extrato);
        getSupportActionBar().setTitle("Extrato");





      /*  calendarView.setOnMonthChangedListener(new OnMonthChangedListener() {
            @Override
            public void onMonthChanged(MaterialCalendarView widget, CalendarDay date) {
                Log.i("data","valor:" + (date.getMonth()+1) + "/" +date.getYear());
            }
        });

*/
    }
}
