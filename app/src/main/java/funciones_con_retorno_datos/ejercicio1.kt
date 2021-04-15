package funciones_con_retorno_datos

fun promedio(numero1:Int, numero2:Int, numero3:Int): Int {
    val promedio = (numero1 + numero2 + numero3) / 3
    return promedio
}

fun main() {
//    Elaborar una función que reciba tres enteros y nos retorne el valor promedio de los
//    mismos.

    print("Ingrese el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    print("Ingrese el tercer numero: ")
    val numero3 = readLine()!!.toInt()

    println("El promedio de los numeros ingresados es: ${promedio(numero1, numero2, numero3)}")
}