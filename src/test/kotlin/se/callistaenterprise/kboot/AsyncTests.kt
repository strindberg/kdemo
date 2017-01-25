package se.callistaenterprise.kboot

import kotlinx.coroutines.async
import kotlinx.coroutines.await
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import java.util.concurrent.CompletableFuture.supplyAsync

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AsyncTests {

    @Autowired
    lateinit var restTemplate: TestRestTemplate

    private fun runAsync(v: Int, path: String) =
            supplyAsync {
                println("starting $v")
                Thread.sleep(1000)
                restTemplate.getForEntity(path, String::class.java).body
            }

    @Test
    fun testAsync() {
        val future = async {
            val lastName = runAsync(1, "/customers").await().slice(34..42)
            println("lastName: $lastName")
            runAsync(2, "/customers/find?lastName=$lastName").await()
        }
        println("started them")
        println("result: ${future.get()}\n\n")
    }

}
