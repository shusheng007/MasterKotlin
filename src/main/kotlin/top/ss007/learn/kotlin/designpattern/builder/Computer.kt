package top.ss007.learn.kotlin.designpattern.builder

class Computer(
    val cpu: String = "英特尔",
    val ram: String = "金士顿",
    val usbCount: Int = 2,
    val keyboard: String = "罗技",
    val display: String = "京东方"
) {

    override fun toString(): String {
        return "Computer(cpu='$cpu', ram='$ram', usbCount=$usbCount, keyboard='$keyboard', display='$display')"
    }
}