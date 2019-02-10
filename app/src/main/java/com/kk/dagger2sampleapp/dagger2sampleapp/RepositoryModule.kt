package com.kk.dagger2sampleapp.dagger2sampleapp

import dagger.Module
import dagger.Provides

// モジュールで依存先を指定
// 依存先のインスタンスを返す
@Module
class RepositoryModule {
    @Provides
    fun provideGreetingRepository(): GreetingRepository {
        return GreetingRepository()
    }
}