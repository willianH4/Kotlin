package POO_Enun_Class

//Definir un enum class almacenando como constante los nombres de varios países
//sudamericanos y como propiedad para cada país la cantidad de habitantes que tiene.
//Definir una variable de este tipo e imprimir la constante y la cantidad de habitantes de
//dicha variable.

enum class Paises(val cantidadHabitantes: Int) {
    El_Salvador(5000000),
    Honduras(4000000),
    Nicaragua(4000500),
    Guatemala(5000000),
    Costa_Rica(4000000)
}


fun main() {
    val paises = Paises.El_Salvador
    val habitantes = paises.cantidadHabitantes
    println("Pais: $paises, Cantidad de habitantes: $habitantes")

}