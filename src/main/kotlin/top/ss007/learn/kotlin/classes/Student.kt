package top.ss007.learn.kotlin.classes

class Student (val clothes: String){

    lateinit var studyResult: String

    private var _name: String = "ben"

    val name: String
        get() {
            return _name
        }

    var age: Int = 18
        set(value) {
            if (value > 100) {
                println("老而不死是为妖")
            } else {
                field = value
            }
        }
        get() {
            return field + 1
        }

    val height: Int
        get() {
            return 180
        }

    var gender: String = "人妖"

    companion object {
        const val SCHOOL_NAME = "耀华"

        fun readName() {

        }
    }
}