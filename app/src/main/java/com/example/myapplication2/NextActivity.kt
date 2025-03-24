package com.example.myapplication2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication2.databinding.NextActivityBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: NextActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NextActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.getStringExtra("DATA")
        Toast.makeText(applicationContext,data, Toast.LENGTH_SHORT).show()
//        binding.textView.text = data
    }
}