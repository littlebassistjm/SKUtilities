package com.example.skutilities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.skutilities_library.Utilities1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Utilities1.Toast("This is a toast from my Utilities library", this);
    }
}
