package estructura_for

fun main() {
//    Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos muestre la
//    tabla de multiplicar del mismo (los primeros 12 términos)
//    Ejemplo: Si ingresó 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.

   var contador = 0
    println("Ingresa un valor del 1 - 10: ")
    var valor = readLine()!!.toInt()
    println("La tabla del 1 - 12 del valor ingresado es: ")

    for (i in 1..12) {
        contador++
        val resultado = valor * contador
        println("$valor * $contador = $resultado")
    }
}