package joker.pnam.daggerhiltdemo.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import joker.pnam.daggerhiltdemo.APIPhucTap
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppProvidesModules {

    @Provides
    @Singleton
    fun providerNetwork(): APIPhucTap = APIPhucTap.from()
}