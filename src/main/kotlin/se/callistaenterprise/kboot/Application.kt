package se.callistaenterprise.kboot

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        repository.save(Customer("Marit", "Bjørgen"))
        repository.save(Customer("Petter", "Northug"))
        repository.save(Customer("Therese", "Johaug"))
        repository.save(Customer("Martin", "Johnsrud Sundby"))
        repository.save(Customer("Bente", "Skari"))
        repository.save(Customer("Bjørn", "Dæhlie"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
