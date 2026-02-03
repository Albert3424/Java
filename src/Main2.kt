fun main()
{
    val logs = """
        INFO user1 login
        ERROR user2 failed
        INFO user1 logout
        INFO user3 login
        ERROR user2 timeout
        INFO user1 login
    """.trimIndent()

    val result = processLogs(logs)
    println(result)
}


fun processLogs(logs: String): Map<String, Int>
{
    val counts = mutableMapOf<String, Int>()

    logs.splitToSequence("\n")
        .filter { it.isNotBlank() && !it.startsWith("ERROR") }
        .forEach { line ->
            val user = line.split(" ")[1]
            counts[user] = (counts[user] ?: 0) + 1
        }

    return counts.toMap()
}