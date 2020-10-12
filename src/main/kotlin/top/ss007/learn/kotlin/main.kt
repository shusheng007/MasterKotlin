package top.ss007.learn.kotlin

import top.ss007.learn.kotlin.designpattern.builder.Computer
import top.ss007.learn.kotlin.designpattern.builder.Computer1
import top.ss007.learn.kotlin.designpattern.builder.Computer2
import top.ss007.learn.kotlin.designpattern.builder.Computer3


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
    val computer= Computer(ram="海力士",keyboard = "双飞燕")

    val computer1 = Computer1.Builder().
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
        setCup("AMD")
        setRam("海力士")
        setDisplay("三星")
        setUsb(3)
        setKeyboard("罗技")
    }

}


