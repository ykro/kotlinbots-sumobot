package com.bitandik.labs.kotlinbots.sumobot

/**
 * Created by ykro.
 */
class Constants {
    companion object {
        const val TAG = "kotlinbots"

        //pin names for i.MX7D
        const val leftServoPinName = "PWM2"
        const val rightServoPinName = "PWM1"

        //Servo
        const val SERVO_MIN_ANGLE = 0.0
        const val SERVO_MAX_ANGLE = 180.0
        const val SERVO_PULSE_MIN_DURATION = 1.0
        const val SERVO_PULSE_MAX_DURATION = 2.0

        //Wheel
        const val W_STOP = 0
        const val W_FORWARD = 1
        const val W_BACKWARD = 2

        const val LEFT_SIDE = true
        const val RIGHT_SIDE = false

        //Nearby API
        const val NEARBY_SERVICE_ID = "com.bitandik.labs.kotlinbots"

        //commands
        const val FWD = "fwd"
        const val BACK = "back"
        const val LEFT = "left"
        const val RIGHT = "right"
        const val STOP = "stop"
    }
}