package funciones_con_retorno_datos

fun perimetro(lado:Int) :Int{
    val resultado = lado * 4
    return resultado
}

fun main() {
//    Elaborar una función que nos retorne el perímetro de un cuadrado pasando como
//    parámetros el valor del lado.

    print("Ingrese el valor del lado: ")
    val lado = readLine()!!.toInt()

    println("El perimetro del cuadrado es: ${perimetro(lado)}")
}