package se.callistaenterprise.demo

// Function definition can give parameters default values
fun printArgs(name: String, number: Int = 0, toUpperCase: Boolean = false) {
    print((if (toUpperCase) name.toUpperCase() else name) + number);
}

fun printAll() {
    printArgs("a")
    // Method parameters can be named in method invocation
    printArgs("b", number = 1)
    printArgs("c", toUpperCase = true)
    printArgs(name = "d", number = 2, toUpperCase = true)
}

fun main(args: Array<String>) {

}