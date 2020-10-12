package top.ss007.learn.kotlin.designpattern.builder

class Computer1 private constructor(
    val cpu: String,
    val ram: String,
    val usbCount: Int,
    val keyboard: String,
    val display: String
) {

    private constructor(builder: Builder) : this(
        builder.cpu,
        builder.ram,
        builder.usbCount,
        builder.keyboard,
        builder.display
    )

    class Builder {
        var cpu: String = ""
            private set
        var ram: String = ""
            private set
        var usbCount: Int = 0
            private set
        var keyboard: String = ""
            private set
        var display: String = ""
            private set

        fun setCup(inputCup: String) = apply {
            this.cpu = inputCup
        }

        fun setRam(inputRam: String) = apply {
            this.ram = inputRam
        }

        fun setUsb(inputUsb: Int) = apply {
            this.usbCount = inputUsb
        }

        fun setKeyboard(inputKeyboard: String) = apply {
            this.keyboard = inputKeyboard
        }

        fun setDisplay(inputDisplay: String) = apply {
            this.display = inputDisplay
        }

        fun build() = Computer1(this)
    }

    override fun toString(): String {
        return "Computer(cpu='$cpu', ram='$ram', usbCount=$usbCount, keyboard='$keyboard', display='$display')"
    }

}