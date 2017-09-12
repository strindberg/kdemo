package se.callistaenterprise.demo

// Existing classes can be extended.
fun MutableList<String>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun useListSwap() {
    val list = mutableListOf("1", "3", "2")
    // Within scope of extension, "swap" looks like a regular function
    list.swap(1, 2) // List is now ("1", "3", "2")
}
