package com.huhu.cn.testkotlinproject

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.verticalLayout

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_textview.setText("test");
        test_textview.setOnClickListener {

            // 启动新的界面
            startActivity(Intent(this@MainActivity,SecondActivity::class.java))

        }


    }
}
