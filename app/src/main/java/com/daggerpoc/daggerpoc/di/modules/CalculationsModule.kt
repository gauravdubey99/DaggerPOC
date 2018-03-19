package com.daggerpoc.daggerpoc.di.modules

import com.daggerpoc.daggerpoc.data.NumbersObject
import com.daggerpoc.daggerpoc.di.modules.calculations.Addition
import dagger.Module
import dagger.Provides
import javax.inject.Inject

/**
 * Created by gaurav on 19/3/18.
 */
@Module
class CalculationsModule @Inject constructor(private val numObject : NumbersObject){

    @Provides
    fun provideNumberObject() : NumbersObject = numObject

    @Provides
    fun provideAdditionObject() : Addition = Addition(numObject)
}