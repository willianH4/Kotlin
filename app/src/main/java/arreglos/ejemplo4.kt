package arreglos

fun main() {
//    Cargar un arreglo de 10 elementos de tipo entero. Imprimir luego el primer y último
//            elemento.

    val arreglo = IntArray(10)
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }
    println("Primera componente del arreglo ${arreglo[0]}")
    println("Ultima componente del arreglo ${arreglo[arreglo.lastIndex]}")
}