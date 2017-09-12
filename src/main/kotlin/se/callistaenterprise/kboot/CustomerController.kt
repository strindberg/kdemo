package se.callistaenterprise.kboot

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController()
class CustomerController(val repository: CustomerRepository) {

    @GetMapping("/customers/find")
    fun findByNames(@RequestParam lastName: String, @RequestParam firstName: String?) =
            if (firstName != null) repository.findByFirstNameAndLastName(firstName, lastName)
            else repository.findByLastName(lastName)

}
