val sampleInt = 10
val numInHex = 0x0A
val longNum = 3L
val doubleNumber = 3.5
val floatNumber = 3.5F
val stringVal = "Hello"

val intNum: Int = 10
// Kotlin does not support automatic type conversions
val intToDoubleNum : Double = intNum.toDouble()

val doubleNum: Double = 10.5
val doubleToIntNum = doubleNum.toInt()

val char1: Char = 'a'
val charToIntNum = char1.toInt()

// Bitwise operations
val bitwiseOr = intNum or doubleToIntNum
val bitwiseAnd = intNum and doubleToIntNum

val xOr = intNum xor doubleToIntNum
val shl = intNum shl 5

// Specifying object types are optional except when using more generic types
val iNumber: Any = 10

fun main(args: Array<String>) {
    // A string can be accessed as an array using an index
    println(stringVal[0])

    for(char in stringVal) {
        print(char)
    }

    println()
}