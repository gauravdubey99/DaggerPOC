package com.daggerpoc.daggerpoc.application

import android.app.Application
import com.daggerpoc.daggerpoc.data.NumbersObject
import com.daggerpoc.daggerpoc.di.DaggerDependencyComponent
import com.daggerpoc.daggerpoc.di.DependencyComponent
import com.daggerpoc.daggerpoc.di.modules.CalculationsModule
import com.daggerpoc.daggerpoc.di.modules.ContextModule

/**
 * Created by gaurav on 19/3/18.
 */

class ApplicationClass : Application(){
    lateinit var dependentComponent : DependencyComponent
    override fun onCreate() {
        super.onCreate()
        dependentComponent  = DaggerDependencyComponent.builder()
                .calculationsModule(CalculationsModule(NumbersObject(5,2)))
                .contextModule(ContextModule(this)).build()
    }
}