package funciones_con_unica_expresion

fun superficie(lado1:Int, lado2:Int) = lado1 * lado2

fun main() {
//    Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la
//    función recibe como parámetros los valores de dos de sus lados:
//    fun retornarSuperficie(lado1: Int,lado2: Int): Int
//    En la función main del programa cargar los lados de dos rectángulos y luego mostrar
//    cual de los dos tiene una superficie mayor.
//lado * lado

    var contador = 0
    var respuesta1 = 0
    var respuesta2 = 0
    for (i in 1..2) {
        contador++
        println("Info del rectangulo $contador: ")
        print("Ingrese el valor del lado 1: ")
        val lado1 = readLine()!!.toInt()
        print("Ingrese el valor del lado 2: ")
        val lado2 = readLine()!!.toInt()

        if (contador == 1){
            respuesta1 = superficie(lado1, lado2)
            println("El resultado $contador es: $respuesta1")
        }
        if (contador == 2) {
            respuesta2 = superficie(lado1, lado2)
            println("El resultado $contador es: $respuesta2")
        }
    }
    when {
        respuesta1 > respuesta2 -> println("El triangulo 1 tiene mayor superficie: $respuesta1")
        respuesta2 > respuesta1 -> println("El triangulo 2 tiene mayor superficie: $respuesta2")
    }

}