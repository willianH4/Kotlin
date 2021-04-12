package estructura_for

fun main() {
//    Desarrollar un programa que solicite la carga de 10 números e imprima la suma de los
//            últimos 5 valores ingresados.

    var contador = 0
    var suma = 0.0

    for (i in 1..10){
        contador++
        print("Ingrese el valor $contador: ")
        var valor = readLine()!!.toDouble()
        if (contador > 5){
            suma+= valor
        }
    }
    println("La suma de los ultimos 5 valores es $suma")
}