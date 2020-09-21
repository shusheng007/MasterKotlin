package top.ss007.learn.kotlin

import top.ss007.learn.java.Fun2
import top.ss007.learn.java.Main
import top.ss007.learn.java.feature.GenericDemo
import top.ss007.learn.kotlin.constructs.runAll
import top.ss007.learn.kotlin.features.runDelegate


fun main(args: Array<String>) {

    GenericDemo().run()
    runDelegate()
    runAll()
    //从kotlin调用Java方法
    Main().javaCalculate(4, 5) { a, b -> a + b }
    Main().javaCalculate(4, 5, object : Fun2<Int, Int, Int> {
        override fun invoke(p1: Int, p2: Int): Int {
            return p1 + p2
        }
    })
}


