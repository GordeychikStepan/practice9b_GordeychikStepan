package products

data class Order(val product: Product, val quantity: Int) {

    fun total(): Double {
        return product.price * quantity
    }

}