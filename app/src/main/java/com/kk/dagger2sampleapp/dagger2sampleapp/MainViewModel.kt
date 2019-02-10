package com.kk.dagger2sampleapp.dagger2sampleapp

import javax.inject.Inject

// コンストラクタでGreetingRepositoryに依存注入する
class MainViewModel @Inject constructor(private val greetingRepository: GreetingRepository) {

    fun greet(): String {
        // greetingRepositoryはGreetingRepositoryに依存注入されている
        return this.greetingRepository.greet()
    }
}