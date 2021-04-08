package estructuras_condicional_anidadas

fun main() {
//    Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor de ellos.
    print("Ingresa el numero 1: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el numero 2: ")
    val numero2 = readLine()!!.toInt()
    print("Ingresa el numero 3: ")
    val numero3 = readLine()!!.toInt()

    val mayor = if (numero1 > numero2 && numero1 > numero3) "El mayor es $numero1"
    else if (numero2 > numero1 && numero2 > numero3) "El mayor es $numero2" else "El mayor es $numero3"

    println(mayor)
}