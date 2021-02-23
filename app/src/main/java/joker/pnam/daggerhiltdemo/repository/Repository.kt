package joker.pnam.daggerhiltdemo.repository

import joker.pnam.daggerhiltdemo.database.Local
import joker.pnam.daggerhiltdemo.database.Network
import javax.inject.Singleton

@Singleton
interface Repository {
    val network: Network
    val local: Local
    fun function(): Int
}