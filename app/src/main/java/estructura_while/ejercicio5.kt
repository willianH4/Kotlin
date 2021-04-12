package estructura_while

fun main() {
//    Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 - 24,
//    etc.
    val final = 500 / 8
    var inicio = 0
    var suma = 0
    while (inicio < final ) {
        inicio++
        suma+= 8
        println("La posicion $inicio tiene como valor $suma")
    }
}