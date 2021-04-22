package funciones_parametros_y_retorno_de_arreglos

fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
}

fun imprimir(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}

fun main() {
//    Definir en la función main un arreglo de enteros de 5 elementos. Declarar dos funciones, en
//    una efectuar la carga de sus elementos y en la otra su impresión.

    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}