package se.callistaenterprise.demo

fun configuredStart(start: Int, configurer: (Int) -> Unit) {
    configurer(start)
}

fun useConfigurer() {
    configuredStart(3, { it.rangeTo(5).toString() })
}

fun configuredInt2(start: Int, configurer: Int.() -> Unit) {
    start.configurer()
}

fun useConfigurer2() {
    val result = configuredInt2(3, { rangeTo(5).toString() })
}
