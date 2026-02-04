fun getSafeLength(str: String?): Int {
    return str?.length ?: 0
}

fun processAny(value: Any?): Int {
    if (value == null) return -1

    if (value is String) {
        return value.length
    }

    val intValue = value as? Int
    if (intValue != null) {
        return intValue * intValue
    }

    return 0
}

fun findFirstInt(list: List<Any?>): Int? {
    for (item in list) {
        if (item is Int) return item

        val strValue = item as? String
        val converted = strValue?.toIntOrNull()

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
    println(processAny("Kotlin"))
    println(processAny(5))
    println(processAny(null))
    println(processAny(3.14))

    /* 3 */
    val list: List<Any?> = listOf("apple", null, "42", 10.5, 100)

    val result = findFirstInt(list)
    println(result)
}