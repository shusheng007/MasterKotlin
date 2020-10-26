package top.ss007.learn.kotlin.properties

import top.ss007.learn.kotlin.annotations.Focus
import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/*open class Animal {
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
}*/

fun runPropertyDemo() {
    /*val animal: Animal = Dog()

    println("The weight of specific animal  is ${animal.weight}")

    println("The name of dog is ${animal.name}")
    animal.name = "藏獒"
    println("The name of dog is ${animal.name}")*/

    Demo().run {
        //        println("赋值前：$p")
//        p = "ShuSheng007"
//        println("赋值后：$p")
//        println("第1次:$lazyValue")
//        println("第2次:$lazyValue")
//        name = "shusheng007"
//        println("My name is:$name")

//        println("my netName is $netName and I am $age years old")
        println(p)
    }

}

class MyDelegate : ReadWriteProperty<Demo, String> {
//    private var myValue: String = "who"
//
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "你好：$thisRef, 我代理 '${property.name}' 完成取值:$myValue"
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
//        myValue = value
//        println("你好 $thisRef , 我代理 '${property.name}' 完成赋值: $value")
//    }

    override fun getValue(thisRef: Demo, property: KProperty<*>): String {
        return "ss007坐怀不乱"
    }

    override fun setValue(thisRef: Demo, property: KProperty<*>, value: String) {
    }
}

class MyDelegateProvider {
    operator fun provideDelegate(thisRef: Demo, property: KProperty<*>): ReadWriteProperty<Demo, String> {
        //do something
        println("做了一些扫黄打非的工作")
        return MyDelegate()
    }
}

class Demo {
    var p: String by MyDelegateProvider()

    val lazyValue: String by lazy {
        println("喊!")
        "we love ss007"

    }

    var name: String by Delegates.observable("ben") { prop, old, new ->
        println("属性${prop.name}的值从: $old -> $new")
    }

    val map = mapOf<String, Any?>(
        "netName" to "ss007",
        "age" to 35
    )

    val mutableMap = mutableMapOf<String, Any?>(
        "netName" to "ss007",
        "age" to 35
    )


    var netName: String by mutableMap
    val age: Int by map


}

class Car(@Focus var wheel: Int) {
     var speed: Int = 0
        @Focus set(value) {
            field = value
        }
         get() {
            return 100
        }

     val weight: Int
         @Focus get() = 1000
}