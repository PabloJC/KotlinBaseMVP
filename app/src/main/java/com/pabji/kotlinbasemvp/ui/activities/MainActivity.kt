package com.pabji.kotlinbasemvp.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pabji.kotlinbasemvp.R
import com.pabji.kotlinbasemvp.app.app
import com.pabji.kotlinbasemvp.domain.features.MainModule
import com.pabji.kotlinbasemvp.domain.features.MainPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity() , MainPresenter.View {

    @Inject lateinit var presenter: MainPresenter

    val component by lazy { app.component.plus(MainModule(this)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        component.inject(this)

        initView()
    }

    private fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
