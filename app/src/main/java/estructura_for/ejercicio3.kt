package estructura_for

fun main() {
//    Desarrollar un programa que muestre la tabla de multiplicar del 5 (del 5 al 50)

    var inicio = 5
    var contador = 0

    println("La tabla de multiplicar es: ")
    for (i in 1..10) {
        contador++
        val resultado = inicio * contador
        println("$inicio * $contador = $resultado")
    }
}