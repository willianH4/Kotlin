package estructura_condicional_when

fun main() {
//    Se ingresa por teclado un valor entero, mostrar una leyenda por pantalla que indique si
//    el número es positivo, nulo o negativo.

    print("Ingresa un numero: ")
    val numero = readLine()!!.toInt()

    when {
        numero > 0 -> println("El numero es positivo")
        numero < 0 -> println("El numero es negativo")
        else -> "El numero es nulo"
    }

}