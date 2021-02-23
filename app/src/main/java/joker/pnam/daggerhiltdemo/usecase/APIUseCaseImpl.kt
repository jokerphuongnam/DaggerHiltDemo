package joker.pnam.daggerhiltdemo.usecase

import joker.pnam.daggerhiltdemo.repository.Repository
import javax.inject.Inject

class APIUseCaseImpl @Inject constructor(override val repository: Repository) : UseCase {
    override fun function(): Int {
        return 5
    }
}