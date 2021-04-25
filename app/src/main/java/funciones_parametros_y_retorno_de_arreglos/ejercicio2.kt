package funciones_parametros_y_retorno_de_arreglos

fun asignarElementos():IntArray{
    print("Cuantos elementos desea cargar: ")
    val elementos = readLine()!!.toInt()
    val arregloElementos = IntArray(elementos)
   for (i in arregloElementos.indices){
       println("Ingrese el valor del elemento: ")
       arregloElementos[i] = readLine()!!.toInt()
   }
    return arregloElementos
}

fun menorElemento(arregloElemento: IntArray){
    var contador = 0
    var menor = arregloElemento.minOrNull()

    for (i in arregloElemento.indices) {
       if (arregloElemento[i] == menor){
           contador+=menor
       }
    }
    println("El valor menor es: $menor")
    if (contador > menor!!.toInt()){
        println("El valor menor se repite")
    }
}

fun main() {
//    Cargar un arreglo de n elementos. Imprimir el menor elemento y un mensaje si se
//            repite dentro del arreglo.

    val cantidad = asignarElementos()
    menorElemento(cantidad)
}