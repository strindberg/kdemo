package se.callistaenterprise.demo

// when is similar to java's case switch
fun transform(color: String): Int =
        when (color) {
            "Red" -> 0
            "Green" -> 1
            "Blue" -> 2
            else -> -1
        }

// when can choose path on any boolean expression
fun classify(x: Int) {
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outside the range")
        else -> print("none of the above")
    }
}

// when also works on instance checks, and branches can throw exceptions
fun size(e: Any) =
        when (e) {
            is Int -> e
            // Note that the compiler knows that e is a String on right side
            is String -> Integer.parseInt(e)
            else -> throw IllegalArgumentException("Unknown expression")
        }
