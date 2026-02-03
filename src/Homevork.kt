fun main()
{
    /* 1 */
    val array = Array(10) { it + 1 }

    for (i in 0 until array.size)
    {
        if (array[i] % 2 == 0)
            println(array[i])
    }

    /* 2 */

    val array = intArrayOf(-5, 0, 3, 10, 15)
    for (num in array) {
        when (num) {
            in Int.MIN_VALUE..-1 -> println("negative")
            0 -> println("zero")
            in 1..9 -> println("small")
            in 10..Int.MAX_VALUE -> println("big")
        }
    }

    /* 3 */

    val n = readLine()?.toIntOrNull() ?: return
    val arr = IntArray(n)
    for (i in 0 until n) {
        arr[i] = -n + i
    }

    for (i in arr.indices step 2) {
        val element = arr[i]
        when {
            element < 0 -> println("minus")
            element == 0 -> println("zero")
            element > 0 && element % 2 == 0 -> println("even")
            element > 0 && element % 2 != 0 -> println("odd")
        }
    }
}
