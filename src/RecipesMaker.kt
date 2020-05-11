import kotlin.test.assertEquals

fun main(args: Array<String>) {
    val ingredientes: List<String> = listOf<String>("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    val msgEntrada = """
        :: Bienvenido a Recipe Maker ::

        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
        Ingrese su opción: 
    """.trimIndent()

    programaCocina@ do {
        print(msgEntrada)
        val response:String? = readLine()
        val reResponse:Int = response?.toIntOrNull() ?: 0

        when(reResponse){
            1 -> {
                println("Vas hacer una receta con los siguientes ingredientes:\n${ingredientes}" +
                        "\n................\n................\n\n")
                continue@programaCocina
            }
            2 -> {
                println("Tus recetas son: \n...\n...\n...\n\n")
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
