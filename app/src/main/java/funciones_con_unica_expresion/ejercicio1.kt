package funciones_con_unica_expresion

fun promedio(numero1:Int, numero2:Int, numero3:Int) = (numero1 + numero2 + numero3) / 3

fun main() {
//    Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
//    mismos.

    print("Ingrese el primer valor: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val numero2 = readLine()!!.toInt()
    print("Ingrese el tercer valor: ")
    val numero3 = readLine()!!.toInt()

    println("El promedio de los numeros ingresados es: ${promedio(numero1, numero2, numero3)}")
}