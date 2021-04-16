package funciones_con_unica_expresion

fun perimetro(lado:Int) = lado * 4

fun main() {
//    Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
//    parámetros el valor del lado.

    print("Ingrese el valor de un lado: ")
    val lado = readLine()!!.toInt()
    println("El perimetro es: ${perimetro(lado)}")
}