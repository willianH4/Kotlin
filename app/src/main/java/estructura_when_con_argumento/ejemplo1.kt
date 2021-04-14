package estructura_when_con_argumento

fun main() {
//    Ingresar un valor entero comprendido entre 1 y 5. Mostrar el mismo en castellano.
    print("Ingrese un valor entero entre 1 y 5:")
    val valor = readLine()!!.toInt()
    when (valor) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
        else -> print("valor fuera de rango")
    }
}