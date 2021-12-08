import enums.Ingredients
import enums.Size

class Pizza {
    var isHot: Boolean? = null
    var testo: Size? = null
    var ingredient1: Ingredients? = null
    var ingredient2: Ingredients? = null
    var ingredient3: Ingredients? = null

    fun eatPizza() {
        println("Eat pizza")
        Thread.sleep(2000)
        println("Thank you, pizza was amazing")
    }
}