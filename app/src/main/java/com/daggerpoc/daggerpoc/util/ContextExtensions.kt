package com.daggerpoc.daggerpoc.util

import android.support.v7.app.AppCompatActivity
import com.daggerpoc.daggerpoc.application.ApplicationClass
import com.daggerpoc.daggerpoc.di.DependencyComponent

/**
 * Created by gaurav on 19/3/18.
 */

val AppCompatActivity.component : DependencyComponent
    get() = (application as ApplicationClass).dependentComponent
