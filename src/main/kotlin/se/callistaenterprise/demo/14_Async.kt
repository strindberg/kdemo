package se.callistaenterprise.demo

import kotlinx.coroutines.async
import kotlinx.coroutines.await
import java.util.concurrent.CompletableFuture.supplyAsync

fun runAsync(v: Int) = supplyAsync {
    Thread.sleep(1000)
    v + 1
}

fun testAsync() {
    val future = async {
        val nextValue = runAsync(1).await()
        runAsync(nextValue).await()
    }

    println("result: ${future.get()}\n\n")
}

