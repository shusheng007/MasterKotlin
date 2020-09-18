package top.ss007.learn.kotlin.classes

//sealed class
sealed class Human {
    abstract fun eat(): Unit
    open fun program(){
        println("I use kotlin")
    }
}

class Man : Human() {
    override fun eat() {
    }

    override fun equals(other: Any?): Boolean {
        return this === other
    }

    override fun hashCode(): Int {
        return System.identityHashCode(this)
    }
}

class Woman : Human(){
    override fun eat() {
    }

    override fun program() {
        super.program()
    }
}
//----------end----------------



