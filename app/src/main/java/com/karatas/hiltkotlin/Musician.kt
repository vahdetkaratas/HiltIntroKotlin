package com.karatas.hiltkotlin

import com.karatas.hiltkotlin.Band
import com.karatas.hiltkotlin.Instrument
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton
class Musician
    @Inject
    constructor(instrument: Instrument, band : Band) {
    fun sing() {
        println("working")
    }
}