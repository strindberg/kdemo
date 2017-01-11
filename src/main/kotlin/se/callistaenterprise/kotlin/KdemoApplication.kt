package se.callistaenterprise.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KdemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(KdemoApplication::class.java, *args)
}
