package se.jh.kotlin

interface Mailer {
    fun sendMessage(email: String, message: String)
}

class Client(val email: String?)

// Methods with non-nullable argument definitions cannot be called with nullable arguments
fun sendMessageToClient(client: Client?, message: String, mailer: Mailer) {
    // Null-safe chaining of method calls
    val email = client?.email


        // Compiler infers that email is non-null
        mailer.sendMessage(email!!, message)

}
