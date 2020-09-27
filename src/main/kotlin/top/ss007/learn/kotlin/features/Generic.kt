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

fun getAnimalFromReadableBox(b: ReadableBox<Animal>){
    val a: Animal = b.getAnimal()
}

fun putAnimalToWritableBox(b:WritableBox<Dog>){
    b.putAnimal(Dog())
}

fun getAnimalFromBox(b: Box<out Animal>) : Animal {
    val animal: Animal = b.getAnimal()
//    b.putAnimal(Nothing) 无法调用，因为方法需要一个Nothing类型的对象，但是在kotlin中无法获取
    return animal
}

fun putAnimalInBox(b: Box<in Dog>){
    b.putAnimal(Dog())
    val animal:Any? = b.getAnimal()
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
    //协变了
    val dogBox: Box<Dog> = DogBox()
    getAnimalFromBox(dogBox)

    val readableDogBox : ReadableBox<Dog> = GetDogBox()
    getAnimalFromReadableBox(readableDogBox)

    getAnimalFromReadableBox(object :ReadableBox<Dog>{
        override fun getAnimal(): Dog {
            return Dog()
        }
    })

    putAnimalToWritableBox(object :WritableBox<Animal>{
        override fun putAnimal(a: Animal) {
        }
    })

}



