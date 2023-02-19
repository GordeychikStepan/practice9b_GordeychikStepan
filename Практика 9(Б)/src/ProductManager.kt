package products

class ProductManager(val name: String) {

    private val blacklistedClients = mutableListOf<Client>()

    fun addProduct(product: Product) {
        println("Товаровед добавил товар: ${product.name}.")
    }

    fun registerSale(order: Order, client: Client) {
        println("Товаровед '${name}' зарегистрировал оплату клиента '${client.name}': ${order.product.name} на ${order.quantity}шт...")
    }

    fun notRegisterSale(order: Order, client: Client) {
        println("Товаровед '${name}' не зарегистрировал оплату клиента '${client.name}': ${order.product.name} на ${order.quantity}шт...")
        blacklistedClients.add(client)
        println("Клиент '${client.name}' в черном списке.")
    }

}