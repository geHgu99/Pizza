interface Builder {
    val pizza: Pizza
    fun setSize()
    fun setIngredien1()
    fun setIngredien2()
    fun setIngredien3()
    fun bakePizza()
    fun getResult(): Pizza
}