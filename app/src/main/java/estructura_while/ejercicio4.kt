package estructura_while

fun main() {
//    Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44, etc. (No se
//    ingresan valores por teclado)

//    contadores
    val final = 25
    var inicio = 0
    var suma = 0
    while (inicio < final ) {
        inicio++
        suma+= 11
        println("La posicion $inicio tiene como valor $suma")
    }
}