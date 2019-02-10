package com.kk.dagger2sampleapp.dagger2sampleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // MainViewModelに依存する
    // このプロパティをデリファレンスするとMainViewModelの動きをする
    @Inject
    lateinit var viewModel: MainViewModel

    // コンポーネントを取得
    // ViewModelインスタンスを返すModuleをMainActivityに注入する定義済み
    private val component = DaggerMainActivityComponent.builder()
        .viewModelModule(ViewModelModule())
        // componentのとり方が変わっているため要調査
//        .repositoryModule(RepositoryModule())
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // inject()を行うと、@Injectのついたプロパティにインスタンスが注入される
        // viewModelに
        this.component.inject(this)

        // viewModelはMainViewModelに依存注入されているため、greet()はMainViewModelの結果が返る
        // Helloが出力される
        println("put: ${this.viewModel.greet()}")
    }
}
