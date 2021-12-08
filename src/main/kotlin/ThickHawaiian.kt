import enums.Ingredients
import enums.Size

class ThickHawaiian: Builder {
    override val pizza: Pizza = Pizza()

    override fun setSize() {
        pizza.testo = Size.THICK
    }

    override fun setIngredien1() {
        pizza.ingredient1 = Ingredients.CHEESE
    }

    override fun setIngredien2() {
        pizza.ingredient2 = Ingredients.PINEAPPLE
    }

    override fun setIngredien3() {
        pizza.ingredient3 = Ingredients.CHICKEN
    }

    override fun bakePizza() {
        pizza.isHot = true
    }

    override fun getResult() = pizza
}