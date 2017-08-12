package com.pabji.kotlinbasemvp.domain.features

import com.pabji.kotlinbasemvp.ui.activities.MainActivity
import dagger.Subcomponent

@Subcomponent(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(activity: MainActivity)
    fun inject(presenter: MainPresenter)
}
