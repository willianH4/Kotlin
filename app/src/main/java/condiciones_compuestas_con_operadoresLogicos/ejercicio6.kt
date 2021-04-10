package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Escribir un programa en el cual: dada una lista de tres valores enteros ingresados por
//            teclado se guarde en otras dos variables el menor y el mayor de esa lista. Utilizar el if
//        como expresión para obtener el mayor y el menor.
//        Imprimir luego las dos variables.

    print("Ingresa el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    print("Ingresa el tercer numero: ")
    val numero3 = readLine()!!.toInt()

    val mayor = if (numero1 > numero2 || numero1 > numero3) "El mayor es $numero1" else "No encontrado"
    val menor = if (numero1 > numero2 || numero2 > numero3) "El menor es $numero3" else "No encontrado"

    println("$mayor \n $menor")

}