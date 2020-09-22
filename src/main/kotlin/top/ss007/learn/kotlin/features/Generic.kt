package top.ss007.learn.kotlin.features

open class Animal
class Dog : Animal()


interface Box<T> {
    fun getAnimal(): T
    fun putAnimal(a: T)
}

interface ReadableBox<out T> {
    fun getAnimal(): T
}

interface WritableBox<in T> {
    fun putAnimal(a: T)
}

fun getAnimalFromBox(b: Box<out Animal>) {
    val a: Animal = b.getAnimal()
}

fun getAnimalFromReadableBox(b: ReadableBox<Animal>){
    val a: Animal = b.getAnimal()
}

class DogBox : Box<Dog> {
    override fun getAnimal(): Dog {
        TODO("Not yet implemented")
    }

    override fun putAnimal(a: Dog) {
        TODO("Not yet implemented")
    }
}

class GetDogBox :ReadableBox<Dog>{
    override fun getAnimal(): Dog {
        TODO("Not yet implemented")
    }
}

fun run() {
    val dogBox: Box<Dog> = DogBox()
    //协变了
    getAnimalFromBox(dogBox)

    val readableDogBox : ReadableBox<Dog> = GetDogBox()
    getAnimalFromReadableBox(readableDogBox)
}



