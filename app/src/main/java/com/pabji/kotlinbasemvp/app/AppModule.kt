package com.pabji.kotlinbasemvp.app

import com.pabji.kotlinbasemvp.domain.navigation.Router
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module class AppModule(val app: BaseApp) {
    @Provides @Singleton fun provideApp() = app
    @Provides @Singleton fun provideRouter() = Router(app)
}