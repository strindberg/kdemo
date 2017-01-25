package se.callistaenterprise.demo

class Values(val values: List<String>) {
    // If statements are expressions
    fun getValues1(reverse: Boolean): List<String> {
        return if (!reverse) values else values.reversed()
    }

    // The same method can be written even shorter
    fun getValues2(reverse: Boolean) = if (!reverse) values else values.reversed()

}