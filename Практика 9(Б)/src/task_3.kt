import products.*
import kotlin.system.exitProcess

fun main() {

    // товаровед
    val productManager = ProductManager("Михаил")
    // клиент
    val client1 = Client("Алиса")
    val client2 = Client("Том")

    // товары
    val product1 = createElProduct()
    val product2 = createProduct()

    // товаровед добавляет инвормацию о товаре
    productManager.addProduct(product1)
    product1.getInfo()
    productManager.addProduct(product2)
    product2.getInfo()
    println()

    // клиент разместил заказ
    val order1 = Order(product1, 10)
    client1.placeOrder(order1)
    val order2 = Order(product2, 2)
    client2.placeOrder(order2)
    println()

    // товаровед зарегистрировал оплату
    productManager.registerSale(order1, client1)

    // товаровед не зарегистрировал оплату
    productManager.notRegisterSale(order2, client2)

}

fun createElProduct(): ElectronicProduct{
    println()
    println("Добавление електронного товара.")
    try {
        print("Введите название товара: ")
        val name = readLine().toString()

        print("Введите цену товара: ")
        val price = readLine()!!.toDouble()
        if (price < 0) throw Exception()

        print("Введите фирму товара: ")
        val manufacturer = readLine().toString()

        print("Введите гарантийный срок товара (в месяцах): ")
        val warrantyPeriod = readLine()!!.toInt()
        if (warrantyPeriod < 0 || warrantyPeriod > 120) throw Exception()

        if (name.isBlank() || manufacturer.isBlank()) throw Exception()

        return ElectronicProduct(name, price, manufacturer, warrantyPeriod)
    }
    catch (e: Exception){
        println("Ошибка ввода данных.")
        exitProcess(0)
    }
}

fun createProduct(): Product{
    println()
    println("Добавление товара")
    try {
        print("Введите название товара: ")
        val name = readLine().toString()

        print("Введите цену товара: ")
        val price = readLine()!!.toDouble()
        if (price < 0) throw Exception()

        if (name.isBlank()) throw Exception()

        return Product(name, price)
    }
    catch (e: Exception){
        println("Ошибка ввода данных.")
        exitProcess(0)
    }
}