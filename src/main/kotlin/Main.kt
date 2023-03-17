fun main() {
    val purchaseSum: Int = 10000
    val regularCustomer: Boolean = true

    val discount: Int = if (purchaseSum in (0..1000)) 0
    else (if (purchaseSum in (1001..10000)) 100
    else if (purchaseSum > 10_000) {
        (purchaseSum / 100 * 5)
    } else 0)
    val extraDiscountForRegular: Int = if (regularCustomer) {
        (purchaseSum - discount) / 100 * 1
    } else 0
    val totalDiscount: Int = discount + extraDiscountForRegular
    println("Ваша скидка составила $totalDiscount руб.")
    val sumWithDiscount: Int = purchaseSum - totalDiscount
    println("Итоговая стоимость покупки: $sumWithDiscount руб.")
}