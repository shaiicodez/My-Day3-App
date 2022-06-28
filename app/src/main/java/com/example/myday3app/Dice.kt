package com.example.myday3app

// TODO [2] : Add Dice Class
class Dice(val numSides: Int){

    fun roll(): Int {
        return (1..numSides).random()
    }
}