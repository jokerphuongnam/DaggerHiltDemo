package joker.pnam.daggerhiltdemo.database

import joker.pnam.daggerhiltdemo.APIPhucTap
import javax.inject.Inject


class DefaultNetworkImpl @Inject constructor(private val APIPhucTap: APIPhucTap) : Network{
    override fun cong() = APIPhucTap.so1() + APIPhucTap.so2()
}