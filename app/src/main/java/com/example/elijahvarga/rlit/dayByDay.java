package com.example.elijahvarga.rlit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

public class dayByDay extends AppCompatActivity {

    private Button greenDayButton;
    private Button redDayButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_day_by_day);
        initDayByDay();
        HashSet<Date> events = new HashSet<>();
        events.add(new Date());

        rlitCalendarView cv = ((rlitCalendarView)findViewById(R.id.calendarView));
        cv.updateCalendar(events);

        // assign event handler
        cv.setEventHandler(new rlitCalendarView.EventHandler() {
            @Override
            public void onDayLongPress(Date date) {
                // show returned day
                DateFormat df = SimpleDateFormat.getDateInstance();
            }
        });
    }

    private void initDayByDay() {
        greenDayButton = (Button) findViewById(R.id.greenDayButton);
        greenDayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO do whatever greenButton will do
            }
        });

        redDayButton = (Button) findViewById(R.id.redDayButton);
        redDayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO do what redButton will do
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_day_by_day, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
