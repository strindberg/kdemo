package se.callistaenterprise.demo

fun stringInterpolation(input: String): String {
    // String interpolation is checked by compiler
    return "String $input has length ${input.length}"
}
