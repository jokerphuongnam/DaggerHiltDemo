package joker.pnam.daggerhiltdemo.database

import javax.inject.Singleton

@Singleton
interface Network {
    fun cong(): Int
}