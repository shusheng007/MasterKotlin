package top.ss007.learn.kotlin

import top.ss007.learn.java.Fun2
import top.ss007.learn.java.Main
import top.ss007.learn.java.Student
import top.ss007.learn.java.feature.GenericDemo
import top.ss007.learn.kotlin.constructs.runAll
import top.ss007.learn.kotlin.designpattern.builder.Computer
import top.ss007.learn.kotlin.designpattern.builder.Computer2
import top.ss007.learn.kotlin.designpattern.builder.Computer3
import top.ss007.learn.kotlin.features.runDelegate
import top.ss007.learn.kotlin.features.runScopeFunctions


fun main(args: Array<String>) {

//    runScopeFunctions()
//    GenericDemo().run()
//    runDelegate()
//    runAll()
    //从kotlin调用Java方法
/*    Main().javaCalculate(4, 5) { a, b -> a + b }
    Main().javaCalculate(4, 5, object : Fun2<Int, Int, Int> {
        override fun invoke(p1: Int, p2: Int): Int {
            return p1 + p2
        }
    })*/

/*    val studentInfo: String = Student().run {
        name = "ShuSheng007"
        age = 18
        "My name is $name and I amm $age "
    }

    val student = Student().also {
        println("Student对象成功创建了:${it.toString()}")
    }

    with(mutableListOf("shu", "sheng")) {
        add("007")
        println(fold("我们都爱") { result, element -> result + element })
    }




    val runBlock= run {
        "ss007"
    }
    for (c in runBlock.chars()){
        println(c)
    }

    val lambdaBlock :()->String = {
        "ss007"
    }

    for (c in lambdaBlock().chars()){
        println(c)
    }*/

    val computer = Computer.Builder().
                        setCup("英特尔").
                        setRam("金士顿").
                        setDisplay("三星").
                        setUsb(3).
                        setKeyboard("罗技").
                        build()
     val computer2= Computer2.Builder("英特尔","金士顿").
                        setDisplay("京东方").
                        setKeyboard("罗技").
                        build()
    val computer3 = Computer3.build {
        setCup("英特尔")
        setRam("金士顿")
        setDisplay("三星")
        setUsb(3)
        setKeyboard("罗技")
    }

}


