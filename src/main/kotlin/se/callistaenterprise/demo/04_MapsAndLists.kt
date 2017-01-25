package se.callistaenterprise.demo

// Map access and modification have convenient syntax
fun maps() {
    val map = hashMapOf<String, Int>()
    map["a"] = 1
    println(map["a"])
    // Maps can be traversed conveniently
    for ((key, value) in map) {
        println("$key, $value")
    }
}

// Maps and lists are immutable by default
fun maps2() {
    val map: Map<String, Int> = mapOf("one" to 1)
    val list: List<String> = listOf("one", "two")

    // These won't compile
    // map["0"] = 2
    // list[1] = "three"
}
