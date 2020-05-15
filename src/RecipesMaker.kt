import model.Cereal
import model.Fruits
import kotlin.test.assertEquals

fun main(args: Array<String>) {
    //Raw String
    val msgEntrada = """
        :: Bienvenido a Recipe Maker ::

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        Ingrese su opción: 
    """.trimIndent()

    //Ciclo con label para llamado, redundante pero con motivo académico
    programaCocina@ do {
        print(msgEntrada)
        val response:String? = readLine()
        //Operador Elvis para manejar nulos y evitar excepciones
        val reResponse:Int = response?.toIntOrNull() ?: 0
        //When funciona como Switch
        when(reResponse){
            1 -> {
                makeRecipe()
                continue@programaCocina
            }
            2 -> {
                viewRecipe()
                continue@programaCocina
            }
            3 -> {
                println("\n*** Fin del programa ***\n")
            }
            else -> {
                println("\nPor favor selecciona una opción correcta.\n")
                continue@programaCocina
            }
        }
    }while (!reResponse.equals(3))
}

//Funciones
fun makeRecipe() {
    //Definición del array
    val ingredientes = arrayOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    println("""
Hacer receta
Selecciona por categoría el ingrediente que buscas""")
    //Recorrer array imprimiendo el index
    for ((index, ingrediente) in ingredientes.withIndex()){
        println("${index + 1}. $ingrediente")
    }
    print("Ingresa una opción de categoría: ")
    val response:String? = readLine()
    //Operador Elvis para manejar nulos y evitar excepciones
    val reResponse:Int = response?.toIntOrNull() ?: 0
    //Envío de datos a función
    viewIngredientsCategory(reResponse)
}

fun viewRecipe() {
    println("\nVer mis recetas\n")
}

fun viewIngredientsCategory(reResponse: Int) {
    when(reResponse){
        1 -> println("Solo está de frutas y cereales (5 o 6)")
        2 -> println("Solo está de frutas y cereales (5 o 6)")
        3 -> println("Solo está de frutas y cereales (5 o 6)")
        4 -> println("Solo está de frutas y cereales (5 o 6)")
        5 -> {
            val fruits = Fruits(1.0)
            fruits.read(fruits.listCatSelected)
        }
        6 -> {
            val cereal = Cereal(1.0)
            cereal.read(cereal.listCatSelected)
        }
        7 -> println("Solo está de frutas y cereales (5 o 6)")
        8 -> println("Solo está de frutas y cereales (5 o 6)")
        else -> println("Ingresa una opción correcta")
    }
}
