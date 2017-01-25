package se.callistaenterprise.demo

import se.callistaenterprise.java.Animal

class Person(val firstName: String, var middleName: String?, val lastName: String)

class KotlinAnimal(val sound: String) : Animal(sound) {
    override fun doSound() {
        println("in child")
        super.doSound()
    }
}
