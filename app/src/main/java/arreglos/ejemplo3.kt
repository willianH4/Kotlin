package arreglos

fun main() {
//    Cargar un arreglo de 10 elementos de tipo entero y verificar posteriormente si el mismo está
//            ordenado de menor a mayor.

    val arreglo = IntArray(10)
    for(i in 0..arreglo.size-1) {
        print("Ingrese elemento:")
        arreglo[i] = readLine()!!.toInt()
    }

    var ordenado = true
    for(i in 0..arreglo.size-2) {
        if (arreglo[i + 1] < arreglo[i])
            ordenado = false
        break
    }
    if (ordenado)
        print("Los elementos están ordenados de menor a mayor")
    else
        print("Los elementos no están ordenados de menor a mayor")
}