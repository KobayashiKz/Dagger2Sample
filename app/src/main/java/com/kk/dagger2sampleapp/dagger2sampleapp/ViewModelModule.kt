package com.kk.dagger2sampleapp.dagger2sampleapp

import dagger.Module
import dagger.Provides

// モジュールを定義
// ViewModelのインスタンスをProvideする
@Module
class ViewModelModule {
    @Provides
    fun provideMainViewModel(greetingRepository: GreetingRepository): MainViewModel {
        return MainViewModel(greetingRepository)
    }
}