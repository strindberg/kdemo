package se.callistaenterprise.demo

fun configuredStart(start: Int, configurer: (Int) -> String): String {
    return configurer(start)
}

fun useConfigurer() {
    println(configuredStart(3, { it.rangeTo(5).toString() }))
}

fun configuredInt2(start: Int, configurer: Int.() -> String): String {
    return start.configurer()
}

fun useConfigurer2() {
    println(configuredInt2(3, { rangeTo(5).toString() }))
}
