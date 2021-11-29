package com.example.sample

import android.content.Context
import android.widget.Toast

class AlertBuilder {
    fun buildAlertDialog(context: Context) {
        Toast.makeText(context, "sample integ", Toast.LENGTH_LONG).show()
    }
}