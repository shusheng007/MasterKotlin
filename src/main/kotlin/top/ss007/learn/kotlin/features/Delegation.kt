package top.ss007.learn.kotlin.features

//传统代理模式实现方式
interface Meeting {
    fun speek()
}

class PiMin : Meeting {
    override fun speek() {
        println("我们要降房价")
    }
}

class RenDaDaiBiao1(private val pi: Meeting) : Meeting {
    override fun speek() {
        println("今年以来经济如此之差，难道")
        pi.speek()
        println("吗？房地产作为我国经济发展的支柱产业，压舱石...")
        println()
    }
}
//---------------------------------------------------------------------


class RenDaDaiBiao2(pi: Meeting) : Meeting by pi

class RenDaDaiBiao3(private val pi: Meeting) : Meeting by pi {
    override fun speek() {
        println()
        println("我代表的一个屁民竟然说：")
        pi.speek()
        println("你们听听，这还有大局观吗？今年以来经济如此之差，有些屁民还要降房价，难道要造...？")
    }
}


fun runDelegate() {
    val piMin = PiMin()
    RenDaDaiBiao1(piMin).speek()
    RenDaDaiBiao2(piMin).speek()
    RenDaDaiBiao3(piMin).speek()

}
