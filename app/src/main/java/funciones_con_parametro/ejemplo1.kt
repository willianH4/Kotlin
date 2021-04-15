package funciones_con_parametro

fun mmostrarMensaje(mensaje: String) {
    println("*************************************************")
    println(mensaje)
    println("*************************************************")
}

fun cargarSumar() {
    print("Ingrese el primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor:")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun main() {
//    Confeccionar una aplicación que muestre una presentación en pantalla del programa.
//    Solicite la carga de dos valores y nos muestre la suma.
//    Mostrar finalmente un mensaje de despedida del programa.

    mmostrarMensaje("El programa calcula la suma de dos valores ingresados por teclado.")
    cargarSumar()
    mmostrarMensaje("Gracias por utilizar este programa")
}