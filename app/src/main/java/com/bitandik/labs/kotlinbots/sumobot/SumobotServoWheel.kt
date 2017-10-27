package com.bitandik.labs.kotlinbots.sumobot

import com.google.android.things.contrib.driver.pwmservo.Servo

/**
 * Created by ykro.
 */

class ServoWheel(pinName: String, private val side: Boolean) : Servo(pinName) {
    var direction: Int = W_STOP

    init {
        setPulseDurationRange(SERVO_PULSE_MIN_DURATION, SERVO_PULSE_MAX_DURATION)
        setAngleRange(SERVO_MIN_ANGLE, SERVO_MAX_ANGLE)
        setEnabled(true)
        stop()
    }

    fun stop() {
        angle = 90.0
        direction = W_STOP
    }

    fun forward() {
        angle = if (side == LEFT_SIDE) 180.0 else 0.0
        direction = W_FORWARD
    }

    fun backward() {
        angle = if (side == LEFT_SIDE) 0.0 else 180.0
        direction = W_BACKWARD
    }

    fun getDirectionString(): String {
        return when (direction) {
            W_STOP -> "Stopped"
            W_FORWARD -> "Forward"
            W_BACKWARD -> "Backward"
            else -> ""
        }
    }
}