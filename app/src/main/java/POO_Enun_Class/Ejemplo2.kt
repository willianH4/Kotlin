package POO_Enun_Class

//Declarar un enum class que represente las cuatro operaciones básicas, asociar a cada
//constante un String con el signo de la operación.
//Definir una clase Operación que defina tres propiedades, las dos primeras deben ser los
//números y la tercera el tipo de operación.

enum class TipoOperacion (val tipo: String) {
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}
class Operacion (val valor1: Int, val valor2: Int, val tipoOperacion: TipoOperacion) {
    fun operar() {
        var resultado: Int = 0
        when (tipoOperacion) {
            TipoOperacion.SUMA -> resultado = valor1 + valor2
            TipoOperacion.RESTA -> resultado = valor1 - valor2
            TipoOperacion.MULTIPLICACION -> resultado = valor1 * valor2
            TipoOperacion.DIVISION -> resultado = valor1 / valor2
        }
        println("$valor1 ${tipoOperacion.tipo} $valor2 es igual a $resultado")
    }
}
fun main() {
    val operacion1 = Operacion(10, 4, TipoOperacion.SUMA)
    operacion1.operar()
    val operacion2 = Operacion(22, 11, TipoOperacion.MULTIPLICACION)
    operacion2.operar()
}