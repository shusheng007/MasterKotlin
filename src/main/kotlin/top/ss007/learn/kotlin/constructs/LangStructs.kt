package top.ss007.learn.kotlin.constructs

//扩展函数
fun String.wrapWithSymbol(): String {
    return "<$this>"
}

//扩展属性
val <T> List<T>.lastIndex: Int
    get() = this.size - 1

//操作符重载
data class Point(val x: Int, val y: Int) {
    operator fun plus(p: Point): Point {
        return Point(p.x + x, p.y + y)
    }
}

//中位扩展函数
infix fun Int.repeatTimes(str: String): String = str.repeat(this)

//函数类型参数
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}


fun runAll() {
    //调用扩展属性
    println(listOf(1, 2, 3, 4).lastIndex)
    //调用扩展方法
    println("my name is ${"shusheng007".wrapWithSymbol()}")
    //调用操作符重载
    val p1 = Point(1, 2)
    val p2 = Point(3, 4)
    println("the sum of p1 and p2 is: ${p1 + p2}")
    //调用中缀方法
    println("first style: ${2 repeatTimes "ss007"} | second style: ${2.repeatTimes("ss007")}")

    //调用函数类型参数的方法
//    val result = calculate(1, 2, { x, y -> x + y })
    val result = calculate(1, 2) { x, y -> x + y }
    println("the result : $result")


}