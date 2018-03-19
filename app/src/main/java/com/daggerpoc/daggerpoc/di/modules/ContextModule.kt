package com.daggerpoc.daggerpoc.di.modules

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by gaurav on 19/3/18.
 */
@Module
class ContextModule(private val applicationContext : Application){

    @Provides
    fun provideApplicationContext() : Context = applicationContext

}