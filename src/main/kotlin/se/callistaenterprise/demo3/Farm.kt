package se.callistaenterprise.demo3

class Farm(val animals: List<Animal>) {
    fun analyzeSounds() {
        animals.forEach { animal -> println(animal.sound?.length) }
    }
}

fun main(args: Array<String>) {
    val farm = Farm(listOf(Animal(null)))
    farm.analyzeSounds()
}
