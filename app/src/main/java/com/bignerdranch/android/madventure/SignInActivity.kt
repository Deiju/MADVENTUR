

package com.bignerdranch.android.madventure

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import retrofit2.Call
import retrofit2.Response

class SignInActivity : ComponentActivity() {
    lateinit var email:EditText
    lateinit var password :EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email =findViewById(R.id.email)
        password =findViewById(R.id.password)
    }

    fun Enter(view: View) {

        val intent=Intent(this,ResultActivity::class.java)
        startActivity(intent)
        finish()
    }
}

