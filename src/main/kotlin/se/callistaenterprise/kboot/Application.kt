package se.callistaenterprise.kboot

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
        repository.save(Customer("Kal", "Johansson"))
        repository.save(Customer("Kal", "Andersson"))
        repository.save(Customer("Kal", "Nilsson"))
        repository.save(Customer("Ada", "Johansson"))
        repository.save(Customer("Ada", "Svensson"))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}
