package joker.pnam.daggerhiltdemo.di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object ViewModelProvidesModules{
    @Provides
    @ViewModelScoped
    fun createViewModel(): MutableLiveData<Int> = MutableLiveData<Int>()
}