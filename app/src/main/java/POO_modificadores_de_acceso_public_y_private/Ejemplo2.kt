package POO_modificadores_de_acceso_public_y_private

//Plantear una clase llamada Dado. Definir una propiedad privada llamada valor y tres
//métodos uno privado que dibuje una línea de asteríscos y otro dos públicos, uno que genere
//un número aleatorio entre 1 y 6 y otro que lo imprima llamando en este último al que dibuja
//la línea de asteríscos.

class Dado{
    private var valor: Int = 1
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
    }
    fun imprimir() {
        separador()
        println("Valor del dado: $valor")
        separador()
    }
    private fun separador() = println("**************************************")
}

fun main() {
    val dado1 = Dado()
    dado1.tirar()
    dado1.imprimir()
}