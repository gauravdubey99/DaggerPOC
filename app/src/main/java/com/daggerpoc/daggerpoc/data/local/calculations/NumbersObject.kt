package com.daggerpoc.daggerpoc.data.local.calculations

import dagger.Module
import dagger.Provides

/**
 * Created by gaurav on 19/3/18.
 */
@Module
data class NumbersObject (var number1 : Int = 5, var number2 : Int = 3){
    @Provides
    fun provideNumberObject() : NumbersObject {
        return this
    }
}