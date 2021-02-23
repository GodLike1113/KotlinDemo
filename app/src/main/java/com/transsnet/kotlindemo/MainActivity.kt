package com.transsnet.kotlindemo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_tv.text = "你好！Kotlin!"

        click_tv.setOnClickListener{
            click_tv.text ="你点了一下我！"
            Toast.makeText(this,"已经点了",Toast.LENGTH_LONG).show();
        }

        click_tv.setOnLongClickListener {
            longToast("长toast")
            click_tv.text="长按了";true }
    }
}