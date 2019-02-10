package com.kk.dagger2sampleapp.dagger2sampleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // MainViewModelに依存する
    // このプロパティをデリファレンスするとMainViewModelの動きをする
    @Inject
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inject()を行うと、@Injectのついたプロパティにインスタンスが注入される
        Application.component.inject(this)

        // viewModelはMainViewModelに依存注入されているため、greet()はMainViewModelの結果が返る
        // Hello from Repositoryが出力される
        println("put: ${this.viewModel.greet()}")
    }
}
