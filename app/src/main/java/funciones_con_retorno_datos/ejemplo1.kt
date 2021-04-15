package funciones_con_retorno_datos

fun retornarSuperficie(lado: Int): Int {
    val sup = lado * lado
    return sup
}

fun main() {
//    Confeccionar una función que le enviemos como parámetro el valor del lado de un cuadrado
//    y nos retorne su superficie.

    print("Ingrese el valor del lado del cuafrado:")
    val la = readLine()!!.toInt()
    val superficie = retornarSuperficie(la)
    println("La superficie del cuadrado es $superficie")
}