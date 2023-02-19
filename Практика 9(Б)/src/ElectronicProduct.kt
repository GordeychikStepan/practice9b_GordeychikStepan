import products.*

class ElectronicProduct (name: String, price: Double, val manufacturer: String, val warrantyPeriod: Int) : Product(name, price) {

    override fun getInfo() {
        println("$name ($manufacturer, Гарантия - $warrantyPeriod мес.) - Цена: $price руб.")
    }

}