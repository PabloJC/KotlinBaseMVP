package com.pabji.kotlinbasemvp.app
import android.app.Activity
import android.app.Application
import com.pabji.kotlinbasemvp.data.managers.PreferencesManager

val SPM: PreferencesManager by lazy {
    BaseApp.prefs!!
}

val Activity.app: BaseApp
    get() = application as BaseApp

class BaseApp : Application() {

    companion object {
        var prefs: PreferencesManager? = null
    }

    val component: AppComponent by lazy {
        DaggerAppComponent
                .builder()
                .appModule(AppModule(this))
                .build()
    }

    override fun onCreate() {
        super.onCreate()
        component.inject(this)
        prefs = PreferencesManager(applicationContext)
    }
}
