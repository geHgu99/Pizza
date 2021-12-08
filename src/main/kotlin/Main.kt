fun main() {
    Game.order()
}

object Game {
    init {
        println("Welcome, customer")
    }

    fun order() {
        while (true) {
            print("> Please, order")
            println("SlimMargarita: 1, ThickMargarita: 2, ThickHawaiian: 3")
            val number = readLine()
            val order: Pizza = when (number){
                "1" -> SlimMargarita().getResult()
                "2" -> ThickMargarita().getResult()
                "3" -> ThickHawaiian().getResult()
                else -> continue
            }
            order.eatPizza()
        }
    }
}