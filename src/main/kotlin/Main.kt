import kotlin.math.roundToInt

fun main() {
    task1()
    task2()
    task3()
}

/**
 * задача №1. денежные переводы
 * комиссия 0.75%, но не меньше 35 рублей
 */
fun task1() {
    val amount = 10_000.0 // сумма перевода

    val commission = maxOf(amount * 0.0075, 35.0)

    println("Задача 1. Сумма перевода: $amount руб.")
    println("Задача 1. Размер комиссии: $commission руб.")
}

/**
 * задача №2. люди/человеки
 * согласование слова "человек" в зависимости от числа лайков
 */
fun task2() {
    val likes = 32 // число лайков

    val lastTwo = likes % 100
    val lastOne = likes % 10

    val word = when {
        lastTwo in 11..14 -> "людям"
        lastOne == 1 -> "человеку"
        else -> "людям"
    }

    println("Задача 2. Понравилось $likes $word")
}

/**
 * задача №3. меломан
 * расчёт итоговой стоимости покупки со скидками
 */
fun task3() {
    val purchaseAmount = 15_000.0 // стоимость плкупки
    val isRegularCustomer = true  // статус покупателя

    // шаг 1: базовая скидка
    val afterBaseDiscount = when {
        purchaseAmount <= 1_000 -> purchaseAmount
        purchaseAmount <= 10_000 -> purchaseAmount - 100
        else -> purchaseAmount * 0.95
    }

    // шаг 2: дополнительная скидка 1% для постоянных клиентов
    val finalAmount = if (isRegularCustomer) {
        afterBaseDiscount * 0.99
    } else {
        afterBaseDiscount
    }

    // округление до целого (рубля)
    val roundedAmount = finalAmount.roundToInt()

    println("Задача 3. Итоговая стоимость: $roundedAmount руб.")
}
