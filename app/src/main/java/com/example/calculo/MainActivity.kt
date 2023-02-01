package com.example.calculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SimpleAdapter.ViewBinder
import com.bumptech.glide.Glide
import com.example.calculo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {ActivityMainBinding.inflate(layoutInflater)  }

   var largura:Double = 0.0
   var altura:Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Glide.with(this)
            .load("https://bit.ly/3s7Av2x")
            .into(binding.ImageView)

        largura * altura;






    }
}