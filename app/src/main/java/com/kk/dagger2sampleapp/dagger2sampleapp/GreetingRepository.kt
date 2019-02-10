package com.kk.dagger2sampleapp.dagger2sampleapp

// インターフェースを定義することで、テストでモックへの差し替えが容易になる
interface GreetingReposioryContract {
    fun greet(): String
}

class GreetingRepository: GreetingReposioryContract {
    override fun greet(): String {
        return "Hello from Repository"
    }
}