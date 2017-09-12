package se.callistaenterprise.demo

class Mailer {
    fun sendMessage(message: String) {}

    fun prepareMessage(incomingMessage: String?) {
        // ... prepare message
        if (incomingMessage != null)
            sendMessage(incomingMessage) // Type mismatch. Required: String. Found: String?
    }
}


class Client(val email: String?)


fun sendMessageToClient(client: Client?, message: String, mailer: Mailer) {
    // Null-safe chaining of method calls
    val email = client?.email

    if (email != null)
        // Compiler infers that email is non-null
        mailer.sendMessage(message)
}
