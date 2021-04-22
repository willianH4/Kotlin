package arreglos

fun main() {
//    Realizar un programa que pida la carga de dos arreglos numéricos enteros de 4
//    elementos. Obtener la suma de los dos arreglos elemento a elemento, dicho resultado
//    guardarlo en un tercer arreglo del mismo tamaño.

    val arreglo1 = IntArray(4)
    val arreglo2 = IntArray(4)
    val arreglo3 = IntArray(4)

    var contador = 0
    for (i in 1..2){
        contador++
        println("Ingrese los elementos del arreglo $contador")
        if (contador == 1){
            for (i in arreglo1.indices){
                print("Ingrese el elemento: ")
                arreglo1[i] = readLine()!!.toInt()
            }
        }else if (contador == 2){
            for (i in arreglo2.indices){
                print("Ingrese el elemento: ")
                arreglo2[i] = readLine()!!.toInt()
            }
        }
    }

println("La suma de los elementos del arreglo 1 y 2 es: ")
    for (i in arreglo3.indices){
       arreglo3[i] = arreglo1[i] + arreglo2[i]
    }
    for (i in 0..3) println(arreglo3[i])
}