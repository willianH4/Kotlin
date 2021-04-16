package funciones_con_unica_expresion

fun retornarMayor(v1: Int, v2: Int) = if (v1 > v2) v1 else v2

fun main() {
//    Confeccionar una función que le enviemos como parámetros dos enteros y nos retorne el
//            mayor.

    print("Ingrese el primer valor:")
    val valor1 =readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 =readLine()!!.toInt()
    println("El mayor entre $valor1 y $valor2 es ${retornarMayor(valor1, valor2)}")
}