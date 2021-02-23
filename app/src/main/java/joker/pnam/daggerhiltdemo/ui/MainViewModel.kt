package joker.pnam.daggerhiltdemo.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import joker.pnam.daggerhiltdemo.usecase.UseCase
import javax.inject.Inject
import javax.inject.Named

@HiltViewModel
class MainViewModel @Inject constructor(@Named("1") private val useCase: UseCase): ViewModel() {
    fun function() = useCase.function()
    @Inject lateinit var liveData: MutableLiveData<Int>
}