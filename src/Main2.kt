import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.delay

fun main() = runBlocking {
    launch {
        /* 1 */

        repeat(5)
        {
            println("Корутин")
            delay(100)
        }
    }

    repeat(5)
    {
        println("Main")
        delay(100)
    }

        /* 2 */

    val deferred = async {
        println("Начало")
        delay(1000)
        10
    }

    println("Корутина запущена")

    val result = deferredResult.await()
    println(result)
}
