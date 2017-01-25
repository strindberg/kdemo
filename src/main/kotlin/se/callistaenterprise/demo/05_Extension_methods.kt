package se.callistaenterprise.demo

// Existing classes can be extended. Here MutableList gets a new method: swap
fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun testListSwap() {
    val list = mutableListOf("1", "3", "2")
    list.swap(1, 2)
}
