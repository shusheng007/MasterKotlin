package top.ss007.learn.kotlin.properties

open class Animal {
    open val weight: Int = 100
    open var name: String = "animal"
        set(value) {
            field = value
            println("Animal被设置为$value")
        }
}

class Dog : Animal() {
    override val weight: Int = 200
    override var name: String = "dog"
        set(value) {
            field = value
            println("Dog被设置为$value")
        }
}

class Cat(override var weight: Int) : Animal() {
}

fun runPropertyDemo() {
    val animal: Animal = Dog()

    println("The weight of specific animal  is ${animal.weight}")

    println("The name of dog is ${animal.name}")
    animal.name = "藏獒"
    println("The name of dog is ${animal.name}")

//    println("The weight of animal is ${Animal().weight}")
//    println("The weight of dog is ${Dog().weight}")
//    println("The weight of cat is ${Cat(50).weight}")

}