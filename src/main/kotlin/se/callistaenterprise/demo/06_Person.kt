package se.callistaenterprise.demo

import se.callistaenterprise.java.Animal

class Person(val firstName: String, var middleName: String?, val lastName: String)

class KAnimal(sound: String) : Animal(sound) {
    override fun makeSound() {
        super.makeSound()
    }
}