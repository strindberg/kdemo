package se.callistaenterprise.demo

import kotlinx.coroutines.experimental.CommonPool
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking

fun runAsync(v: Int) = async(CommonPool) {
    Thread.sleep(1000)
    v + 1
}

fun testAsync() {
    // async/await makes thread suspend (but are library functions)
    val result = async(CommonPool) {
        val nextValue = runAsync(1).await()
        // Second call of runAsync depends on return value of first call.
        runAsync(nextValue).await()
    }

    runBlocking {
        println("result: ${result.await()}\n\n")
    }
}
