package se.callistaenterprise.demo

// A restricted set of operators can be overloaded
class NumContainer(var value: Int) {
    // Can be used as ++
    operator fun inc(): NumContainer {
        value++
        return this
    }

    // Can be used as +
    operator fun plus(other: NumContainer): NumContainer = NumContainer(value + other.value)
}

fun testMyNumber() {
    var myNumber = NumContainer(5)
    myNumber++
    val sum = myNumber + NumContainer(3)
}
