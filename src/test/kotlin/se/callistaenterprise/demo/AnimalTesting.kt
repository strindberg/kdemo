package se.callistaenterprise.demo

import org.junit.Test
import se.callistaenterprise.java.Animal

class AnimalTesting {

    @Test
    fun testAnalyze() {
        val farm = Farm(listOf(Animal("oink")))
        farm.analyzeSound()
    }

}
