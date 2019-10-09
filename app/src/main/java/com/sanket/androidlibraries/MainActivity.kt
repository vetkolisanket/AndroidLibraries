package com.sanket.androidlibraries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        btnCalendarDateRangePicker.setOnClickListener { startActivity(CalendarDateRangePickerActivity.newIntent(this)) }
    }
}
