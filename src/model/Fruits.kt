package model

class Fruits(quantity: Double): Ingredients(quantity), Ingredientable{
    val listCatSelected: ArrayList<String> = arrayListOf("Fresa", "Plátano", "Uva", "Manzana", "Naranja", "Pera", "Cereza")
}