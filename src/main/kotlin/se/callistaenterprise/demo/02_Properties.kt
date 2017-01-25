package se.callistaenterprise.demo

// Kotlin classes have properties instead of fields and accessors
class Customer(var firstName: String, var lastName: String) {
    private var age: Int = 5
}

// "getters" and "setters" work without boilerplate
fun handlePerson(person: Customer) {
    println(person.firstName)
    println(person.lastName)
    person.firstName = "New Name"
}
