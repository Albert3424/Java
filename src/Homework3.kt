fun main()
{
    /* 1 */
    val book = Book("Kotlin Guide", -5)
    println("Title: ${book.title}, Pages: ${book.pages}")

    book.pages = 150
    println("New pages: ${book.pages}")

    book.pages = -10
    println("After negative set: ${book.pages}")

    /* 2 */

    val p1 = Product("Laptop")
    p1.price = 1000.0

    val p2 = Product("Laptop")
    p2.price = 1000.0

    val p3 = Product("Phone")
    p3.price = 500.0

    println(p1 == p2)
    println(p1 == p3)

    p1.applyDiscount(10)
    println(p1.toString())
    println("Price after discount: ${p1.price}")

    /* 3 */
    val myLaptop: Device = Laptop("Dell", 0)
    val myPhone: Device = Phone("Samsung", "+79991234567")

    myLaptop.turnOn()

    myPhone.turnOn()
    myPhone.turnOff()

    if (myPhone is Phone) {
        println("Номер телефона: ${myPhone.number}")
    }
}


class Book(val title: String, pages: Int) {
    var pages: Int = if (pages < 0) 0 else pages
        set(value) {
            field = if (value < 0) 0 else value
        }
}

data class Product(val name: String) {
    var price: Double = 0.0
        set(value) {
            field = if (value < 0.0) 0.0 else value
        }

    fun applyDiscount(percent: Int) {
        price -= price * (percent / 100.0)
    }
}

open class Device(val brand: String, var powerOn: Boolean = false) {
    open fun turnOn() {
        powerOn = true
        println("$brand включен")
    }

    fun turnOff() {
        powerOn = false
        println("$brand выключен")
    }
}

class Laptop(brand: String, var batteryLevel: Int) : Device(brand) {
    override fun turnOn() {
        if (batteryLevel == 0) {
            println("$brand не включается: батарея разряжена")
        } else {
            super.turnOn()
        }
    }
}

data class Phone(val phoneBrand: String, val number: String) : Device(phoneBrand)