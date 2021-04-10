package estructura_while

fun main() {
//    Escribir un programa que solicite la carga de un valor positivo y nos muestre desde 1 hasta
//    el valor ingresado de uno en uno.
//    Ejemplo: Si ingresamos 30 se debe mostrar en pantalla los números del 1 al 30.

    print("Ingrese un valor:")
    val valor = readLine()!!.toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x = x + 1
    }
}