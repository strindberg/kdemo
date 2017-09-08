package se.callistaenterprise.demo

class Translator(val translations: Map<String, String>) {
    operator fun get(word: String): String = translations[word] ?: "Not found"
}

fun useTranslator() {
    val translator = Translator(mapOf("hej" to "hi"))
    println(translator["hej"])
}
