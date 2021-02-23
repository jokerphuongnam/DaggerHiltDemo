package joker.pnam.daggerhiltdemo

class APIPhucTap private constructor(){

    class Builder{
       fun build(): APIPhucTap{
           val api = APIPhucTap()
           return api
       }
    }

    fun so1() = 1
    fun so2() = 2

    companion object{
        fun from(): APIPhucTap = APIPhucTap()
    }
}