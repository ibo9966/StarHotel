package com.example.userui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.userui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // initialize the UI

        initUI()
    }

    private fun initUI(){
        binding.fabBack.setOnClickListener{


        }
        binding.btnSignIn.setOnClickListener {


        }
        binding.tvForgotPassword.setOnClickListener{


        }

        binding.tvSignup.setOnClickListener {


        }
    }
}