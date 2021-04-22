package arreglos

fun main() {
//    Desarrollar un programa que permita ingresar un arreglo de 8 elementos enteros, e
//    informe:
//    El valor acumulado de todos los elementos.
//    El valor acumulado de los elementos que sean mayores a 36.
//    Cantidad de valores mayores a 50.
//    (Definir dos for, en el primero realizar la carga y en el segundo proceder a analizar
//            cada elemento)

    val enteros = IntArray(8)
    for (i in enteros.indices) {
        print("Ingrese un elemento: ")
        enteros[i] = readLine()!!.toInt()
    }

    var suma = 0
    var acumulado = 0
    var mayores = 0

    for (i in 0..enteros.size-1) {
        suma += enteros[i]

        when{
            enteros[i] > 36 -> acumulado+= enteros[i]
        }
        if (enteros[i] > 50) mayores++
    }
    println("La suma de todos los valores es: $suma")
    println("La suma de los elementos mayores a 36 es: $acumulado")
    println("Los elementos mayores a 50 son: $mayores")
}