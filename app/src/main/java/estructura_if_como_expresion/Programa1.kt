package estructura_if_como_expresion

fun main() {
//    Cargar dos valores enteros, almacenar el mayor de los mismos en otra variable y mostrarlo.
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    val mayor = if (valor1 > valor2) valor1 else valor2
    println("El mayor entre $valor1 y $valor2 es $mayor")
}