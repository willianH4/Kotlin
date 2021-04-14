package funciones

fun bienvenida(){
    println("=== Ingrese los datos solicitados ===")
}

fun solicitaEntero() {
    print("Ingrese un valor entero: ")
    val numero = readLine()!!.toInt()

    val cuadrado = numero * numero
    println("El cuadrado del valor ingresado es: $cuadrado")
}

fun cargaDosValores() {
    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toDouble()
    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toDouble()

    val producto = valor1 * valor2
    println("El producto de los valores ingresados es: $producto")
}

fun main() {
//    Desarrollar un programa con dos funciones. La primer solicite el ingreso de un entero y
//            muestre el cuadrado de dicho valor. La segunda que solicite la carga de dos valores y
//    muestre el producto de los mismos. LLamar desde la main a ambas funciones.

    bienvenida()
    solicitaEntero()
    cargaDosValores()
}