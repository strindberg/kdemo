package se.callistaenterprise.demo

import java.lang.Integer.parseInt

// Functions are first-class types. No Java-style interface required.
fun functionParameter(value: Int, operator: (Int) -> String): String {
    return operator(value)
}

fun transformList(strings: List<String>): List<Int> {
    // Functional methods on collections don't require Java's stream() and collect()
    return strings.map { parseInt(it) }
}
