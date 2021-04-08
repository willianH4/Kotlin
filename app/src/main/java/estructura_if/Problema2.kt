package estructura_if

fun main() {
//    Se ingresa por teclado un número entero comprendido entre 1 y 99, mostrar un
//    mensaje indicando si el número tiene uno o dos dígitos.

    print("Ingresa un numero del 1 al 99 incluidos ambos numeros: ")
    val numero = readLine()!!.toInt()
    if (numero >= 10 && numero <= 99) println("El numero tiene 2 digitos") else println("El numero tiene un digito")
}