package se.callistaenterprise.demo

class Rational(val numerator: Long, val denominator: Long) {
    operator fun times(other: Rational): Rational {
        return Rational(numerator * other.numerator, denominator * other.denominator)
    }
}

fun handleRationals(val1: Rational, val2: Rational) {
    val val3 = val1 * val2
    if (val3 == val2 * val1) {
        println("Math works!")
    }
}
