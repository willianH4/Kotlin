package estructura_when_con_argumento

fun main() {
//    Realizar la carga de la cantidad de hijos de 10 familias. Contar cuantos tienen 0,1,2 o
//    más hijos. Imprimir dichos contadores.

    var ceroHijos = 0
    var unHijo = 0
    var dosHijos = 0
    var masHijos = 0
    var contador = 0

    for (i in 1..10){
        contador++
        print("Ingrese cuantos hijos tiene la familia $contador: ")
        var hijos = readLine()!!.toInt()

        when (hijos) {
            0 -> ceroHijos++
            1 -> unHijo++
            2 -> dosHijos++
        }
        if (hijos >= 3) {
            masHijos++
        }
    }

    println("Familias con cero hijos: $ceroHijos")
    println("Familias con 1 hijo: $unHijo")
    println("Familias con dos hijos: $dosHijos")
    println("Familias con mas de dos hijos: $masHijos")
}