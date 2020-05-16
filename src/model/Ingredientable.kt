package model

interface Ingredientable {

    fun read(listCatSelected: HashMap<Int, String>){
        println("Los ingredientes de esa categoría para escoger son:")
        listCatSelected.forEach { t, u -> println("$t. $u") }
    }
}