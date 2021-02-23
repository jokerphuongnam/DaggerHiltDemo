package joker.pnam.daggerhiltdemo.repository

import joker.pnam.daggerhiltdemo.database.Local
import joker.pnam.daggerhiltdemo.database.Network
import javax.inject.Inject

class DefaultRepositoryImpl @Inject constructor(
    override val network: Network,
    override val local: Local
) : Repository {
    override fun function(): Int = network.cong()
}