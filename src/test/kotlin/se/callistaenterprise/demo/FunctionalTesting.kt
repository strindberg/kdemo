package se.callistaenterprise.demo

import org.junit.Test

class FunctionalTesting {

    @Test
    fun testAnalyze() {
        functionParameter(1, { it.toString() })
        transformList(listOf("1", "5"))
    }

}
