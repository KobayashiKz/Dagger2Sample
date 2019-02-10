package com.kk.dagger2sampleapp.dagger2sampleapp

import javax.inject.Inject

interface MainViewModelContract {
    fun greet(): String
}

// コンストラクタでGreetingRepositoryに依存注入する
// 注入されるRepositoryの型もインターフェースにする
class MainViewModel @Inject constructor(private val greetingRepository: GreetingReposioryContract)
    : MainViewModelContract {

    override fun greet(): String {
        // greetingRepositoryはGreetingRepositoryに依存注入されている
        return this.greetingRepository.greet()
    }
}
