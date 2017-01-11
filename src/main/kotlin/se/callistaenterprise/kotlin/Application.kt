package se.callistaenterprise.kotlin

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {
    private val log = LoggerFactory.getLogger(this.javaClass.name)

    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        repository.save(Customer("Jack", "Bauer"))
        repository.save(Customer("Chloe", "O'Brian"))
        repository.save(Customer("Kim", "Bauer"))
        repository.save(Customer("David", "Palmer"))
        repository.save(Customer("Michelle", "Dessler"))

        log.info("Customers found with findAll():")
        log.info("-------------------------------")
        for (customer in repository.findAll()) {
            log.info(customer.toString())
        }
        log.info("")

        val customer = repository.findOne(1L)
        log.info("Customer found with findOne(1L):")
        log.info("--------------------------------")
        log.info(customer.toString())
        log.info("")

        log.info("Customer found with findByLastName('Bauer'):")
        log.info("--------------------------------------------")
        for (bauer in repository.findByLastName("Bauer")) {
            log.info(bauer.toString())
        }
        log.info("")
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
