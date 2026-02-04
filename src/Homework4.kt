fun getSafeLength(str: String?): Int {
    return str?.length ?: 0
}

fun processValue(item: Any?): Int {
    if (item == null) return -1
    if (item is String) return item.length

    val number = item as? Int
    if (number != null) return number * number

    return 0
}

fun findFirstNumber(list: List<Any?>): Int? {
    for (item in list) {
        if (item is Int) return item

        val converted = (item as? String)?.toIntOrNull()
        if (converted != null) return converted
    }
    return null
}

fun main()
{
    /* 1 */
    println(getSafeLength("Hello"))
    println(getSafeLength(null))

    /* 2 */
    println(processValue("Kotlin"))
    println(processValue(5))
    println(processValue(null))
    println(processValue(3.14))

    /* 3 */
    val data = listOf(null, "apple", "42", 100, "orange")
    val result = findFirstNumber(data)
    println(result)
}
