package model

interface Ingredientable {

    fun read(listCatSelected: ArrayList<String>){
        println("Los ingredientes de esa categoría para escoger son:")
        for ((index, list) in listCatSelected.withIndex()){
            println("${index + 1}. $list")
        }
    }
}