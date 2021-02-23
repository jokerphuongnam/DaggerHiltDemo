package joker.pnam.daggerhiltdemo.usecase

import joker.pnam.daggerhiltdemo.repository.Repository
import javax.inject.Inject

class DefaultUseCaseImpl @Inject constructor(override val repository: Repository) : UseCase{
    override fun function(): Int {
        return repository.function()
    }
}