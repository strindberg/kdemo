package se.callistaenterprise.demo

interface Mailer {
    fun sendMessage(email: String, message: String)
}


class Client(val email: String?)


fun sendMessageToClient(client: Client?, message: String, mailer: Mailer) {
    // Null-safe chaining of method calls
    val email = client?.email

    if (email != null)
        // Compiler infers that email is non-null
        mailer.sendMessage(email, message)
}
