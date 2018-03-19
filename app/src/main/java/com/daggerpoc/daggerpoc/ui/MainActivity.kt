package com.daggerpoc.daggerpoc.ui

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.daggerpoc.daggerpoc.R
import com.daggerpoc.daggerpoc.di.modules.CalculationsModule
import com.daggerpoc.daggerpoc.di.modules.calculations.Addition
import com.daggerpoc.daggerpoc.extensions.component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var context : Context
    @Inject lateinit var calculationModule : CalculationsModule
    @Inject lateinit var addition : Addition

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        calculationModule.provideNumberObject().number1 = 10
        calculationModule.provideNumberObject().number2 = 13

        Log.d("TAG>>>>>" , "{${addition.doSummation()}}")
    }

}
