package model

class Recipe() {
    val recipes: MutableList<String> = ArrayList()

    fun createRecipe(recipe: String) {
        recipes.add(recipe)
    }

    fun readRecipe() {
        println(recipes.lastIndex)
    }
}