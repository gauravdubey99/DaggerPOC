package com.daggerpoc.daggerpoc.ui.main

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.android.volley.VolleyError
import com.daggerpoc.daggerpoc.R
import com.daggerpoc.daggerpoc.data.remote.RequestInterface
import com.daggerpoc.daggerpoc.data.remote.VolleyStringRequestGet
import com.daggerpoc.daggerpoc.di.modules.CalculationsModule
import com.daggerpoc.daggerpoc.data.local.calculations.Addition
import com.daggerpoc.daggerpoc.util.component
import javax.inject.Inject

class MainActivity : AppCompatActivity(), RequestInterface {

    @Inject lateinit var context : Context
    @Inject lateinit var calculationModule : CalculationsModule
    @Inject lateinit var addition : Addition
    @Inject lateinit var reqQueue : VolleyStringRequestGet

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)

        calculationModule.provideNumberObject().number1 = 10
        calculationModule.provideNumberObject().number2 = 13

        // Just a Sample String make sure to pass the String from some source like a Constant or string resource
        reqQueue.provideStringRequest("https://api.github.com/users/octocat", this)
    }

    override fun onResponse(response: String) {
        Log.d("TAG" , "$response>>>>>")
    }

    override fun onVolleyError(volleyError: VolleyError) {
    }


}
