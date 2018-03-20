package com.daggerpoc.daggerpoc.data.remote

import android.content.Context
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley
import com.daggerpoc.daggerpoc.di.modules.ContextModule
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

/**
 * Created by gaurav on 20/3/18.
 */
@Singleton
@Module(includes = arrayOf(ContextModule::class))
class VolleyRequestProvider @Inject constructor() {

    @Provides
    fun getVolleyInstance(cont : Context) : RequestQueue{
        return Volley.newRequestQueue(cont)
    }

}