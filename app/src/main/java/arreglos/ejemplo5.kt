package arreglos

fun main() {
//    Cargar un arreglo de 5 elementos de tipo entero. Imprimir luego todo el arreglo.

    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }

    for((indice, elemento) in arreglo.withIndex())
        println("En el índice $indice se almacena el elemento $elemento")
}
//
//Carga de los elementos utilizando el for como iterador;
//for((indice, elemento) in arreglo.withIndex())
//{
//    print("Ingrese elemento:")
//    arreglo[indice] = readLine()!!.toInt()
//}

