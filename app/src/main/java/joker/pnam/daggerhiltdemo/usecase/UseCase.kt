package joker.pnam.daggerhiltdemo.usecase

import joker.pnam.daggerhiltdemo.repository.Repository

interface UseCase {
    val repository: Repository
    fun function(): Int
}