package se.callistaenterprise.demo

import kotlinx.coroutines.async
import kotlinx.coroutines.await
import java.util.concurrent.CompletableFuture.supplyAsync

fun runAsync(v: Int) = supplyAsync {
    Thread.sleep(1000)
    v + 1
}

fun testAsync() {
    // async/await makes thread suspend (but are library functions)
    val future = async {
        val nextValue = runAsync(1).await()
        // Second call of runAsync depends on return value of first call.
        runAsync(nextValue).await()
    }

    println("result: ${future.get()}\n\n")
}

