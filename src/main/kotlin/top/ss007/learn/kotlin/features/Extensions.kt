package top.ss007.learn.kotlin.features

import top.ss007.learn.kotlin.classes.Student

var Student.alias: String
    get() {
        return "$name 有个网名叫ss007"
    }
    set(value) {
        name = value
        println("后来其直接将名字也改成了$value")
    }

fun String.decorate(): String {
    return "<$this>"
}

fun method() {
    Student("夹克").run {
        println(alias)
        alias = "ss007"
    }
}
