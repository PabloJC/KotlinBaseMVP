package com.pabji.kotlinbasemvp.app

import com.pabji.kotlinbasemvp.domain.features.MainComponent
import com.pabji.kotlinbasemvp.domain.features.MainModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: BaseApp)
    fun plus(mainModule: MainModule): MainComponent
}