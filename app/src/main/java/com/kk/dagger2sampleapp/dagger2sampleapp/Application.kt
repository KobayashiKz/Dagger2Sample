package com.kk.dagger2sampleapp.dagger2sampleapp

class Application: android.app.Application() {

    companion object {
        lateinit var component: AppComponent private set
    }

    override fun onCreate() {
        super.onCreate()

        // Applicationクラスでコンポーネントを定義
        // companion object で指定することでどこからでも参照することができる
        component = DaggerAppComponent.builder()
            .viewModelModule(ViewModelModule())
            .repositoryModule(RepositoryModule())
            .build()
    }
}