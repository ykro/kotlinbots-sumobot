package com.bitandik.labs.kotlinbots.sumobot

/**
 * Created by ykro.
 */

interface SumobotCallback {
    fun fwd()
    fun back()
    fun left()
    fun right()
    fun stop()
}