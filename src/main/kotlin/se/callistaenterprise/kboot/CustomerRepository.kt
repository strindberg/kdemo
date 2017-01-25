package se.callistaenterprise.kboot

import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customer, Long> {

    fun findByLastName(lastName: String): Iterable<Customer>

    fun findByFirstNameAndLastName(firstName: String, lastName: String): Iterable<Customer>

}
