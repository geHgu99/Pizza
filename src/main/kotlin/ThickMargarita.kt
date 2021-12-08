import enums.Ingredients
import enums.Size

class ThickMargarita: Builder {
    override val pizza: Pizza = Pizza()

    override fun setSize() {
        pizza.testo = Size.THICK
    }

    override fun setIngredien1() {
        pizza.ingredient1 = Ingredients.CHEESE
    }

    override fun setIngredien2() {
        pizza.ingredient2 = Ingredients.TOMATO
    }

    override fun setIngredien3() {
        pizza.ingredient3 = null
    }

    override fun bakePizza() {
        pizza.isHot = true
    }

    override fun getResult() = pizza
}