package estructura_while

import kotlin.math.roundToLong

fun main() {
//    Se ingresan un conjunto de n alturas de personas por teclado (n se ingresa por
//            teclado). Mostrar la altura promedio de las personas.

    print("Ingrese cantidad de alturas de personas: ")
    val cantidad = readLine()!!.toDouble()

    var persona = 0
    var suma = 0.0
    while (persona < cantidad){
           persona++
       print("Ingrese la altura de la persona $persona: ")
        var altura = readLine()!!.toDouble()
        suma+= altura
    }

    val promedio = suma / cantidad
    println("El promedio de altura de las $cantidad personas es: $promedio")
}