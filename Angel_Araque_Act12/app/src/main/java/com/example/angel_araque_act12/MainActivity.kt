package com.example.angel_araque_act12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.HorizontalScrollView
import android.widget.ToggleButton
import androidx.core.graphics.drawable.toDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var toggle:ToggleButton = findViewById(R.id.toggleButton)
        var scrollBar:HorizontalScrollView = findViewById(R.id.horizontalView)
        if(toggle.isChecked) {
            scrollBar.set = false;
        }
        else{
            scrollBar.isHorizontalScrollBarEnabled = true;
        }


    }

}