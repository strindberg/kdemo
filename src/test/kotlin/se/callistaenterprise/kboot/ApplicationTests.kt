package se.callistaenterprise.kboot

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApplicationTests {

	@Autowired
	lateinit var restTemplate: TestRestTemplate

	@Test
	fun findAll() {
		//val content = """[{"firstName":"Kal","lastName":"Johansson","id":1},{"firstName":"Kal","lastName":"Andersson","id":2},{"firstName":"Kal","lastName":"Nilsson","id":3},{"firstName":"Ada","lastName":"Johansson","id":4},{"firstName":"Ada","lastName":"Svensson","id":5}]"""
        val body = restTemplate.getForEntity("/customers", String::class.java).body
        //assertEquals(content, restTemplate.getForEntity("/customers", String::class.java).body)
	}
}
