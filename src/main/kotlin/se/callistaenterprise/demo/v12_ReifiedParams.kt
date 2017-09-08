package se.callistaenterprise.demo

//fun <T> Iterable<*>.brokenFilterIsInstance(): List<T> {
//    val destination = mutableListOf<T>()
//    for (element in this) {
//        if (element is T) {
//            destination.add(element)
//        }
//    }
//    return destination
//}

inline fun <reified T> Iterable<*>.filterIsInstance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}

fun useReifiedFilter() {
    val items = listOf("one", 2, "three")
    println(items.filterIsInstance<String>())
}

// Example taken from Dmitry Jemerov: "Kotlin in Action"
