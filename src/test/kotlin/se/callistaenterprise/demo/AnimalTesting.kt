package se.callistaenterprise.demo

import org.junit.Test
import se.callistaenterprise.demo3.Animal
import se.callistaenterprise.demo3.Farm

class AnimalTesting {

    @Test
    fun testAnalyze() {
        val farm = Farm(listOf(Animal("oink")))
        farm.analyzeSounds()
    }

}
