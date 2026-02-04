fun String.printLength() {
    println("Длина строки: $length")
}

fun Box.area(): Int = width * height

fun User.isAdult(): Boolean = age >= 18

fun main() {
    /* 1 */
    val text: String? = "Hello"
    text?.let {
        it.printLength()
    }

    /* 2 */
    val box = Box().apply {
        width = 10
        height = 5
    }.also {
        println("Объект создан")
    }

    println(box.area())

    /* 3 */
    val user = User().apply {
        name = "Alex"
        age = 20
    }

    user.run {
        if (isAdult()) {
            println("Пользователь совершеннолетний")
        } else {
            println("Пользователь несовершеннолетний")
        }
    }

    with(user) {
        println("Имя: $name, возраст: $age")
    }
}
