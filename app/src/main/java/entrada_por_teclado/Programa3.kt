package entrada_por_teclado

fun main() {
//    Se debe desarrollar un programa que pida el ingreso del precio de un artículo y la cantidad
//    que lleva el cliente. Mostrar lo que debe abonar el comprador.

    print("Ingrese el precio del producto: ")
    val precio = readLine()!!.toDouble()
    print("Ingrese la cantidad de producto: ")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")
}