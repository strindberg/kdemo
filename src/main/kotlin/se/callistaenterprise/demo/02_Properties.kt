package se.callistaenterprise.demo

// Kotlin classes have properties instead of fields and accessors
// "val" and "var" specify whether value can be changed.
class Customer(var firstName: String, val lastName: String)

// Return type specification is optional if compiler can deduce it
fun handleCustomer(customer: Customer) {
    println(customer.firstName)
    println(customer.lastName)
    customer.firstName = "New Name"
}
