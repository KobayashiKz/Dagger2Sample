package com.kk.dagger2sampleapp.dagger2sampleapp

import dagger.Component

// コンポーネントを定義
// モジュールからProvideされるインスタンスをどこに注入するか指定する
// ここではMainViewModelがProvideされてMainActivityに注入
@Component(modules = [ViewModelModule::class, RepositoryModule::class])
interface AppComponent {
    fun inject(activity: MainActivity)
}