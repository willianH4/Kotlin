package entrada_por_teclado

fun main() {
//    Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.
print("Ingrese el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    val suma = numero1 + numero2
    println("La suma de $numero1 + $numero2 es $suma")

    val producto = numero1 * numero2
    println("La multiplicacion de $numero1 * $numero2 es $producto")
}