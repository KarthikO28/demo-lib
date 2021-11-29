package com.example.tester

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertTester {
    fun showAlert(context: Context) {
        Toast.makeText(context, "tester lib is integrated successfully", Toast.LENGTH_LONG).show()
    }
}