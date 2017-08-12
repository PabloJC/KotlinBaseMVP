package com.pabji.kotlinbasemvp.domain.features

import com.pabji.kotlinbasemvp.domain.navigation.Router
import com.pabji.kotlinbasemvp.ui.activities.MainActivity
import javax.inject.Inject


class MainPresenter(val view: View)  {

    @Inject lateinit var router: Router

    interface View

    private var activity: MainActivity = view as MainActivity

    init {
        activity.component.inject(this)
    }
}