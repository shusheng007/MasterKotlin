package top.ss007.learn.kotlin.features

open class Animal
class Dog : Animal()



interface Box<T> {
    fun getAnimal(): T
    fun putAnimal(a: T)
    fun clear(){}
}

class AnimalBox<Animal> : Box<Animal>{
    override fun getAnimal(): Animal {
        TODO("Not yet implemented")
    }

    override fun putAnimal(a: Animal) {
        TODO("Not yet implemented")
    }
}


class DogBox : Box<Dog>{
    override fun getAnimal(): Dog {
        TODO("Not yet implemented")
    }

    override fun putAnimal(a: Dog) {
        TODO("Not yet implemented")
    }
}



fun action(box:Box<Animal>){
    box.putAnimal(Animal())
}

fun run() {
//    val dogBox: Box<Dog> =
    val animalBox:Box<Animal> = AnimalBox()
    action(animalBox)

}