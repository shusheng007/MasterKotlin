package top.ss007.learn.kotlin.classes

class Student(clothes: String) {

    lateinit var studyResult: String

    init {
        studyResult = clothes
    }

    private var _name: String = "ben"

    var name: String
        get() {
            return _name
        }
        set(value) {
            _name = value
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
    }


}