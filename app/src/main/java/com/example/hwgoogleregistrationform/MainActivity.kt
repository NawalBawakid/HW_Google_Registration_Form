package com.example.hwgoogleregistrationform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.hwgoogleregistrationform.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.link.setOnClickListener{
            Toast.makeText(applicationContext, getString(R.string.email), Toast.LENGTH_SHORT).show()
        }

        binding.showpass.setOnClickListener{
            Toast.makeText(applicationContext, getString(R.string.showPassword), Toast.LENGTH_SHORT).show()
        }

        binding.signin.setOnClickListener{
            Toast.makeText(applicationContext, getString(R.string.signin), Toast.LENGTH_SHORT).show()
        }

        binding.buttonNext.setOnClickListener{
            Toast.makeText(applicationContext, getString(R.string.clicknext), Toast.LENGTH_SHORT).show()
        }
    }
}