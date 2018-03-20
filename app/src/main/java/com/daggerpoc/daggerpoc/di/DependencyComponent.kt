package com.daggerpoc.daggerpoc.di

import com.android.volley.RequestQueue
import com.daggerpoc.daggerpoc.data.remote.VolleyRequestProvider
import com.daggerpoc.daggerpoc.data.remote.VolleyStringRequestGet
import com.daggerpoc.daggerpoc.di.modules.CalculationsModule
import com.daggerpoc.daggerpoc.di.modules.ContextModule
import com.daggerpoc.daggerpoc.ui.MainActivity
import dagger.Component
import javax.inject.Singleton

/**
 * Created by gaurav on 19/3/18.
 */
@Singleton
@Component(modules = arrayOf(ContextModule::class , CalculationsModule::class , VolleyStringRequestGet::class))
interface DependencyComponent{
    fun inject(mainActivity : MainActivity)

    fun getSimpleRequest() : VolleyStringRequestGet
}