package products

class Client(val name: String) {

    fun placeOrder(order: Order) {
        println("Клиент '$name' сделал заказ ${order.product.name} на ${order.quantity}шт...")
        println("Финальная цена: ${order.total()}")
    }

}