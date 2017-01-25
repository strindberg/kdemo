package se.callistaenterprise.demo

// Functions are first-class types. No Java style interface required
fun functionParameter(value: Int, transformer: (Int) -> String): String {
    return transformer(value)
}

fun transformList(strings: List<String>): List<Int> {
    // Functional methods on collections don't require Java's stream() and collect()
    return strings.map { Integer.parseInt(it) }
}
