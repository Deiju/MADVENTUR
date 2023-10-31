package com.bignerdranch.android.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import com.bignerdranch.android.madventure.databinding.ActivityMainBinding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun SignIn(view: View) {
        var intent = Intent (this, SignInActivity::class.java)
        startActivity(intent)
        finish()
    }
}