import kotlin.math.pow

infix fun Int.pow(power: Int) : Int = this.toDouble().pow(power).toInt()

//fun Any.displayTypeInfo() = when(this) {
//    is Int -> println("This is Int")
//    is String -> println("This is String")
//    is DataType.DoubleType -> println("This is DoubleType with value of ${this.value}")
//    is DataType.UnitType -> println("This is Unit")
//    else -> println("Type of $this is unknown")
//}

fun Any.displayTypeInfo() = when(this) {
    is Int, is String, is DataType.UnitType -> println("This is ${this::class.simpleName}")
    is DataType.DoubleType -> println("This is DoubleType with value of ${this.value}")
    else -> println("Type of $this is unknown")
}

fun main() {
    println(5 pow 2)
    "123".displayTypeInfo()
    5.displayTypeInfo()
    true.displayTypeInfo()
    listOf(1,2,3).displayTypeInfo()
    DataType.DoubleType(4.0).displayTypeInfo()
    DataType.UnitType().displayTypeInfo()
}