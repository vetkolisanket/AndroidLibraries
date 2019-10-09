package com.sanket.androidlibraries

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class CalendarDateRangePickerActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context) = Intent(context, CalendarDateRangePickerActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar_date_range_picker)
    }
}
