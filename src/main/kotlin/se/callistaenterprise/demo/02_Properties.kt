package se.callistaenterprise.demo

// Kotlin classes have properties instead of fields and accessors
class Customer(var firstName: String, var lastName: String)

fun handlePerson(person: Customer) {
    println(person.firstName)
    println(person.lastName)
    person.firstName = "New Name"
}
