fun main()
{
    val array1 = intArrayOf(10, 20, 30, 40, 50)
    val result = calculateSum(array1)
    println(result)



    println(findMax(3, 7, 2, 9, 1))
    println(findMax(15, 42, 8))



    val array2 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenNumbers = filterEven(array2)
    printNumbers(*evenNumbers)
}

/* 1 */
fun calculateSum(numbers: IntArray): Int
{
    var sum = 0
    for (num in numbers) {
        sum += num
    }
    return sum
}

/* 2 */

fun findMax(vararg numbers: Int): Int
{
    if (numbers.isEmpty()) return 0
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

/* 3 */

fun filterEven(numbers: IntArray): IntArray
{
    var count = 0
    for (num in numbers) {
        if (num % 2 == 0) {
            count++
        }
    }

    val result = IntArray(count)
    var index = 0
    for (num in numbers) {
        if (num % 2 == 0) {
            result[index] = num
            index++
        }
    }
    return result
}

fun printNumbers(vararg numbers: Int)
{
    for (num in numbers) {
        print("$num ")
    }
    println()
}

