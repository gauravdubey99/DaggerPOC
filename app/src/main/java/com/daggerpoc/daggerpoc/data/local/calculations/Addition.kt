package com.daggerpoc.daggerpoc.data.local.calculations

import dagger.Module

/**
 * Created by gaurav on 19/3/18.
 */
@Module
class Addition (var xNum: NumbersObject){

    fun doSummation() : Int{
        return (xNum.number1 + xNum.number2)
    }
}