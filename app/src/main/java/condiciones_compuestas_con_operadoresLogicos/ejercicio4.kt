package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Se ingresan por teclado tres números, si al menos uno de los valores ingresados es
//    menor a 10, imprimir en pantalla la leyenda "Alguno de los números es menor a diez".

    print("Ingresa el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    print("Ingresa el tercer numero: ")
    val numero3 = readLine()!!.toInt()

    if (numero1 < 10 || numero2 < 10 || numero3 < 10) println("Alguno de los numeros es menos a 10") else println("Ninguno es menor")
}