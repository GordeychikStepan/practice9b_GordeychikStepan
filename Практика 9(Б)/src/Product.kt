package products

open class Product(val name: String, val price: Double) {

    open fun getInfo() {
        println("$name - $price руб.")
    }

}