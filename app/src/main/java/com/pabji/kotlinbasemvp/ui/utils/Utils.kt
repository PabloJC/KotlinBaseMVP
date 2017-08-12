package com.pabji.kotlinbasemvp.ui.utils

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.bundleOf

fun AppCompatActivity.addFragment(containerViewId: Int, fragment: Fragment){
    val fragmentTransaction = this.supportFragmentManager.beginTransaction()
    fragmentTransaction.replace(containerViewId, fragment)
    fragmentTransaction.commitAllowingStateLoss()
}

inline fun <reified T : Fragment> newInstance(vararg params: Pair<String, Any>)
        = T::class.java.newInstance().apply {
    arguments = bundleOf(*params)
}