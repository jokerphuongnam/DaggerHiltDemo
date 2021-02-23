package joker.pnam.daggerhiltdemo.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import joker.pnam.daggerhiltdemo.database.DefaultLocalImpl
import joker.pnam.daggerhiltdemo.database.DefaultNetworkImpl
import joker.pnam.daggerhiltdemo.database.Local
import joker.pnam.daggerhiltdemo.database.Network
import joker.pnam.daggerhiltdemo.repository.DefaultRepositoryImpl
import joker.pnam.daggerhiltdemo.repository.Repository
import joker.pnam.daggerhiltdemo.usecase.APIUseCaseImpl
import joker.pnam.daggerhiltdemo.usecase.DefaultUseCaseImpl
import joker.pnam.daggerhiltdemo.usecase.UseCase
import javax.inject.Named


@Module
@InstallIn(SingletonComponent::class)
abstract class AppBindsModules {

    @Binds
    @Named("1")
    abstract fun getUseCase(under: DefaultUseCaseImpl) : UseCase

    @Binds
    @Named("2")
    abstract fun getUseCase2(under: APIUseCaseImpl): UseCase

    @Binds
    abstract fun getRepository(repositoryImpl: DefaultRepositoryImpl): Repository

    @Binds
    abstract fun getNetwork(network: DefaultNetworkImpl) : Network

    @Binds
    abstract fun getLocal(local: DefaultLocalImpl): Local
}