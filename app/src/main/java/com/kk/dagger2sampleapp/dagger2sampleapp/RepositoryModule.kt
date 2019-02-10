package com.kk.dagger2sampleapp.dagger2sampleapp

import dagger.Module
import dagger.Provides

// モジュールで依存先を指定
// 依存先のインスタンスを返す
@Module
class RepositoryModule {
    @Provides
    // モジュールの依存先の型をインターフェースにしておく
    // テスト時の依存先の変更が容易になる
    fun provideGreetingRepository(): GreetingReposioryContract {
        return GreetingRepository()
    }
}