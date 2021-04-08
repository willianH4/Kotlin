package entrada_por_teclado

fun main() {
//    Escribir un programa en el cual se ingresen cuatro números enteros, calcular e
//    informar la suma de los dos primeros y el producto del tercero y el cuarto.

    print("Ingrese el valor del numero 1: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese el valor del numero 2: ")
    val numero2 = readLine()!!.toInt()
    print("Ingrese el valor del numero 3: ")
    val numero3 = readLine()!!.toInt()
    print("Ingrese el valor del numero 4: ")
    val numero4 = readLine()!!.toInt()

    val suma = numero1 + numero2
    val producto = numero3 * numero4
    println("La suma de $numero1 + $numero2 es $suma")
    println("La multiplicacion de $numero3 * $numero4 es $producto")
}