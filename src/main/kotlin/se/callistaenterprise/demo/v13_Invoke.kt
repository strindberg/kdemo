package se.callistaenterprise.demo

class City(val name:String) {
    operator fun invoke(greeting: String) {
        println("$greeting $name")
    }
}

fun useCity() {
    val city = City("Oslo")
    city("Welcome to")
}
