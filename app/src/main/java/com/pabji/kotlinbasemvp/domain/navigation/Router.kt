package com.pabji.kotlinbasemvp.domain.navigation

import android.content.Context
import android.support.v7.app.AppCompatActivity
import com.pabji.kotlinbasemvp.ui.activities.MainActivity
import org.jetbrains.anko.startActivity

inline fun <reified T : AppCompatActivity> AppCompatActivity.navigateTo(){
    startActivity<T>()
}

class Router (val context: Context){

    fun goToMainActivity(){
        context.startActivity<MainActivity>()
    }
}