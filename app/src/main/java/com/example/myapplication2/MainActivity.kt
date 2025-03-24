package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) //zamiana XML na kod Kotlina
        setContentView(binding.root) //uchwyt do głównego kontenera layotu
        binding.button.setOnClickListener{
            val intent = Intent(applicationContext,NextActivity::class.java)//tworzenie intencji
            val data = binding.textinput.text.toString()//dane z pola input
            intent.putExtra("DATA",data)//przekaz dane: identyfikator -> dane
            startActivity(intent)//uruchom aktywnosc
        }
    } }