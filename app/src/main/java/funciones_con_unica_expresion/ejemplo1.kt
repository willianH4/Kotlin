package funciones_con_unica_expresion

fun retornarSuperficie(lado: Int) = lado * lado

fun main() {
//    Confeccionar una función que le enviemos como parámetro el valor del lado de un cuadrado
//    y nos retorne su superficie.

    print("Ingrese el valor del lado del cuafrado:")
    val la = readLine()!!.toInt()
    println("La superficie del cuadrado es ${retornarSuperficie(la)}")
}