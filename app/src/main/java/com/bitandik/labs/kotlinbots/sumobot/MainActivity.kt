package com.bitandik.labs.kotlinbots.sumobot

import android.app.Activity
import android.os.Bundle
import android.util.Log

class MainActivity : Activity(), SumobotCallback {
    private lateinit var connection: NearbyConnection
    private lateinit var left: ServoWheel
    private lateinit var right: ServoWheel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")

        left = ServoWheel(leftServoPinName, LEFT_SIDE)
        right = ServoWheel(rightServoPinName, RIGHT_SIDE)
        connection = NearbyConnection(this, this)
    }

    override fun onStart() {
        super.onStart()
        connection.connect()
    }

    override fun onDestroy() {
        super.onDestroy()
        left.close()
        right.close()
        connection.disconnect()
    }

    override fun fwd() {
        left.forward()
        right.forward()
    }

    override fun back() {
        left.backward()
        right.backward()
    }

    override fun left() {
        left.stop()
        right.forward()
    }

    override fun right() {
        left.forward()
        right.stop()
    }

    override fun stop() {
        left.stop()
        right.stop()
    }
}
