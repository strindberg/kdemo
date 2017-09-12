package se.callistaenterprise.demo

class Strings(val firstName: String, val lastName: String) {

    override fun toString(): String {
        // Strings can contain variables and expressions.
        // Compiler will flag any errors
        return "First Name: $firstName. Double length: ${firstName.length * 2}"
    }

}