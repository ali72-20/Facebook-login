package com.example.facebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import com.example.facebook.databinding.ActivityLogInBinding

class LogIn : AppCompatActivity(), OnClickListener {
    lateinit var binding : ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        login()
    }
    fun login(){
        val logInButton : Button = binding.btnLogin
        logInButton.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}