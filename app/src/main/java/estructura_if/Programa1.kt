package estructura_if

fun main() {
//    Ingresar el sueldo de una persona, si supera los 3000 pesos mostrar un mensaje en pantalla
//    indicando que debe abonar impuestos.
    print("Ingrese su sueldo: ")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Debe pagar impuestos XD")
    else
        println("La libraste no debes pagar impuestos")
}