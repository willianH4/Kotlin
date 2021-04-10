package estructuras_condicional_anidadas

fun main() {
//    Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el número
//    es positivo, nulo o negativo.

    print("Ingrese un numero entero: ")
    val numero = readLine()!!.toInt()

    val resultado = if (numero >= 1) "El numero es positivo"
    else if (numero < 1) "El numero es negativo"
    else "El numero es nulo"

    println(resultado)
}