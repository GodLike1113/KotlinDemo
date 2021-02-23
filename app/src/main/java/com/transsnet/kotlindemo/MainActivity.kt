package com.transsnet.kotlindemo

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.longToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_tv.text = "你好！Kotlin!"

        var count: Int = 0
        click_tv.setOnClickListener {
//            click_tv.text = "你点了一下我！"
//            Toast.makeText(this, "已经点了", Toast.LENGTH_LONG).show();

            when (count) {
                0 -> click_tv.text = "床前明月光"
                1, 3, 5, 7, 9 -> click_tv.text = "疑是地下霜"
                in 10..15 -> click_tv.text = "举头望明月"
                !in 6..8 -> click_tv.text = "低头思故乡"
                //必须要else 分支
                else -> click_tv.text = "静夜思"
            }
            count = (count + 1) % 20
        }


        var int_arr: IntArray = intArrayOf(11, 12, 13)
        var toggle: Boolean = true;
        println(int_arr[2])
        click_tv.setOnLongClickListener {
            longToast("长toast")
            click_tv.text = "长按了";

            click_tv.text = if (toggle) "蒹葭苍苍" else "白露为霜"
            toggle = !toggle
            true
        }


        var stringArr: Array<String> = arrayOf("Hello", "Kotlin")
        var intArr: Array<Int> = arrayOf(1, 2, 3)
        var longArr: Array<Long> = arrayOf(10, 22, 33)
        var i: Int = 0
        while (i < intArr.size) {
            println(intArr[i])
            Log.d("vivi", "打印的值${intArr[i]}")
            i++;
        }


//        var s:Int =String.toInt("5");
        var string: String = "123"
        val substring = string.substring(0, string.length)
        println(substring)

        val split: List<String> = string.split("2")


    }
}