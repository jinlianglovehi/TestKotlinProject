package com.huhu.cn.testkotlinproject

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.View
import org.jetbrains.anko.*

/**
 * Created by jinliang on 17-6-26.
 */
class SecondActivity : Activity(){

    val TAG:String = "SecondActivity";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(TAG," oncreate ")

        //
        verticalLayout{
            padding = dip(30)
            editText {
                hint = "Name"
                textSize = 24f
            }
            editText {
                hint = "Password"
                textSize = 24f
            }
            button("Login") {
                textSize = 26f
            }
        }
    }

    /**
     * 使用的是kotlin 定义的方法信息
     */
    fun defindAddMethod(name:String?){

    }
}