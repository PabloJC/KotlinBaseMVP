package com.pabji.kotlinbasemvp.domain.features

import com.pabji.kotlinbasemvp.ui.activities.MainActivity
import dagger.Module
import dagger.Provides

@Module
class MainModule(val activity: MainActivity) {
    @Provides fun provideLoginPresenter() = MainPresenter(activity)
}