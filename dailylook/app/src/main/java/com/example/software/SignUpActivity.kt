package com.example.software

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.example.software.databinding.ActivitySignupBinding

class SignUpActivity : AppCompatActivity(){

    lateinit var binding : ActivitySignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val yearlist = resources.getStringArray(R.array.year_spinner)
        val monthlist = resources.getStringArray(R.array.month_spinner)
        val datelist = resources.getStringArray(R.array.date_spinner)

        val yearadapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, yearlist)
        val monthadapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, monthlist)
        val dateadapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, datelist)

        binding.signupYearSpinner.adapter = yearadapter
        binding.signupMonthSpinner.adapter = monthadapter
        binding.signupDateSpinner.adapter = dateadapter

        binding.signupYearSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View,
                position: Int,
                id: Long
            ) {
            }
            override fun onNothingSelected(parent: AdapterView<*>) {
                }
            }
        }
        override fun onDestroy() {
            super.onDestroy()
        }

 }

