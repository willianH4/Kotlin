package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Se ingresan por teclado tres números, si todos los valores ingresados son menores a
//    10, imprimir en pantalla la leyenda "Todos los números son menores a diez".

    print("Ingresa el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    print("Ingresa el tercer numero: ")
    val numero3 = readLine()!!.toInt()

    if (numero1 < 10 && numero2 < 10 && numero3 < 10) println("Todos los numeros son menores a 10") else println("No son menores")
}