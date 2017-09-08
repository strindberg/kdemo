package se.callistaenterprise.demo

import se.callistaenterprise.java.Animal

class Farm(val animals: List<Animal>) {
    fun analyzeSound() {
        animals.forEach{ animal -> println(animal.sound.length) }
    }
}
