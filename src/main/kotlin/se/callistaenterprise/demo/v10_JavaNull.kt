package se.callistaenterprise.demo

import se.callistaenterprise.demo3.Animal

class Farm(val animals: List<Animal>) {
    fun analyzeSound() {
        animals.forEach{ animal -> println(animal.sound?.length) }
    }
}

fun main(args: Array<String>){
    val farm = Farm(listOf(Animal(null)))
    farm.analyzeSound()
}
