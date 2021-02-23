package joker.pnam.daggerhiltdemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import dagger.hilt.android.AndroidEntryPoint
import joker.pnam.daggerhiltdemo.R
import joker.pnam.daggerhiltdemo.usecase.UseCase
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()

    @Inject
    @Named("2")
    lateinit var useCase: UseCase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.liveData.observe(this, Observer {
            Log.e("cccccccccccccc", "$it")
        })
        viewModel.liveData.value = 3
        Log.e("cccccccccccc", "${viewModel.function()} - ${useCase.function()}")
    }
}