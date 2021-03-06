package top.ss007.learn.kotlin

import kotlinx.coroutines.*


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
/*    val computer= Computer(ram="海力士",keyboard = "双飞燕")

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
    }*/

/*    with(Student("T恤")){
        age = 20
        println("The age of $name is $age")
    }
*/
/*
    runPropertyDemo()

    method()
*/



//    ProRunner.runJavaPropertyDemo()

/*    runBlocking {

        kotlinx.coroutines.coroutineScope{
            launch {
                println("等")
                delay(3000L)
                println("Task from nested launch")
            }
        }

        launch {

            repeat(10){
                print(".")
                delay(300)
            }
        }

        println("hello")
//        job.join()
    }*/

    val job= GlobalScope.launch {
//        println("the sum of two num is :${getFirstNum()+ getSecondNum()}")
        getSum()
    }

    println("go down")

    runBlocking {
        job.join()
    }

}

suspend fun getFirstNum(): Int{
    delay(1_000)
    println("got first num")
    return 10
}
suspend fun getSecondNum(): Int{
    delay(1_000)
    println("got second num")
    return 15
}

suspend fun getSum(){
    coroutineScope {
        val first : Deferred<Int> = GlobalScope.async{
            throw NullPointerException()
            getFirstNum()
        }

        val second:Deferred<Int> =GlobalScope.async {
            getSecondNum()
        }

        println("the sum of two num is :${first.await()+ second.await()}")
    }

}


