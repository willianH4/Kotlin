package estructura_if_como_expresion

fun main() {
//    Cargar un valor entero por teclado comprendido entre 1 y 99. Almacenar en otra
//    variable la cantidad de dígitos que tiene el valor ingresado por teclado.
//    Mostrar la cantidad de dígitos del número ingresado por teclado.

    print("ingrese un numero entre 1 y 99: ")
    val numero = readLine()!!.toInt()
    val resultado = if (numero > 9) "Tiene dos digitos" else "Tiene un digito"
    println(resultado)
}