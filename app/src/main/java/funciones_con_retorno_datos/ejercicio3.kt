package funciones_con_retorno_datos

fun superficie(lado1:Int, lado2:Int) :Int {
    val resultado = lado1 * lado2
    return resultado
}

fun main() {
//    Confeccionar una función que calcule la superficie de un rectángulo y la retorne, la
//    función recibe como parámetros los valores de dos de sus lados: de tipo Int
//    En la función main del programa cargar los lados de dos rectángulos y luego mostrar
//    cual de los dos tiene una superficie mayor.
//    superficie es igual a lado * lado

    var contador = 0
   for (i in 1..2) {
       contador++
       println("Info del rectangulo $contador: ")
       print("Ingrese el valor del lado 1: ")
       val lado1 = readLine()!!.toInt()
       print("Ingrese el valor del lado 2: ")
       val lado2 = readLine()!!.toInt()
       var respuesta = superficie(lado1, lado2)
       println("La superficie del triangulo $contador es: $respuesta")
       if (respuesta > respuesta) println("El mayor es $respuesta")
   }
}