package POO_Enun_Class

//Declarar una enum class con los nombres de naipes de la baraja inglesa.
//Definir una clase carta que tenga una propiedad de la clase enum class.

enum class TipoCarta{
    DIAMANTE,
    TREBOL,
    CORAZON,
    PICA
}
class Carta(val tipo: TipoCarta, val valor: Int) {
    fun imprimir() {
        println("Carta: $tipo y su valor es $valor")
    }
}
fun main() {
    val carta1 = Carta(TipoCarta.TREBOL, 4)
    carta1.imprimir()
}