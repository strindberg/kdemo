package se.callistaenterprise.demo

import se.callistaenterprise.java.AnAnimal

class Person(val firstName: String, var middleName: String?, val lastName: String)

class KotlinAnimal(val sound: String) : AnAnimal(sound) {
    override fun makeSound() {
        super.makeSound()
    }
}
