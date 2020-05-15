package model

class Cereal(quantity: Double): Ingredients(quantity), Ingredientable{

    val listCatSelected: ArrayList<String> = arrayListOf("Avena", "Trigo", "Arroz", "Maíz")

}