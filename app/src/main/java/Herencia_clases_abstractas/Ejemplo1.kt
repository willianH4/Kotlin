package Herencia_clases_abstractas

//Declarar una clase abstracta que represente una Operación. Definir en la misma tres
//propiedades valor1, valor2 y resultado, y dos métodos: calcular e imprimir.
//Plantear dos clases llamadas Suma y Resta que hereden de la clase Operación.

abstract class Operacion(val valor1: Int, val valor2: Int) {
    protected var resultado: Int = 0
    abstract fun operar()
    fun imprimir() {
        println("Resultado: $resultado")
    }
}

class Suma(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 + valor2
    }
}

class Resta(valor1: Int, valor2: Int): Operacion(valor1, valor2) {
    override fun operar() {
        resultado = valor1 - valor2
    }
}

fun main() {
    val suma1 = Suma(10, 4)
    suma1.operar()
    suma1.imprimir()
    val resta1 = Resta(20, 5)
    resta1.operar()
    resta1.imprimir()
}