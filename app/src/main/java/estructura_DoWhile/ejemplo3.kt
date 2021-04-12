package estructura_DoWhile

fun main() {
//    Realizar un programa que permita ingresar el peso (en kilogramos) de piezas. El proceso
//            termina cuando ingresamos el valor 0.
//    Se debe informar:
//    a) Cuántas piezas tienen un peso entre 9.8 Kg. y 10.2 Kg.?, cuántas con más de 10.2 Kg.? y
//    cuántas con menos de 9.8 Kg.?
//    b) La cantidad total de piezas procesadas.

    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (0 pera finalizar):")
        val peso = readLine()!!.toDouble()
        if (peso > 10.2)
            cant1++
        else
            if (peso >= 9.8)
                cant2++
            else
                if (peso > 0)
                    cant3++
    } while(peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas con un peso superior a 10.2: $cant1")
    println("Piezas con un peso inferior a 9.8: $cant3");
    val suma = cant1 + cant2 + cant3
    println("Cantidad total de piezas procesadas: $suma")
}