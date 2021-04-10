package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Se ingresan tres valores por teclado, si todos son iguales calcular el cubo del número y
//    mostrarlo.

    print("Ingresa el primer numero: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el segundo numero: ")
    val numero2 = readLine()!!.toInt()
    print("Ingresa el tercer numero: ")
    val numero3 = readLine()!!.toInt()

    if (numero1 == numero2 && numero1 == numero3) {
        val cubo = numero1 * numero2 * numero3
        println("El cubo es: $cubo");
    }else "No son iguales"
}