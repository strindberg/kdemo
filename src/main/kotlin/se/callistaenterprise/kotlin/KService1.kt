package se.callistaenterprise.kotlin

import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class Service1 {
    private val LOG = LoggerFactory.getLogger(this.javaClass.name)

    private val host = findMyHostname()

    @RequestMapping("/resource-1/{id}")
    fun getResource(@PathVariable id: String): ResponseEntity<String> {
        LOG.info("Service1 called with id={}", id)
        val response = "Service1@$host:$id"
        LOG.debug("Service1 response={}", response)
        return ResponseEntity<String>(response, HttpStatus.OK)
    }

    private final fun findMyHostname(): String = InetAddress.getLocalHost().hostName

}
