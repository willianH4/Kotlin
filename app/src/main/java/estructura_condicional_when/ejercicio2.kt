package estructura_condicional_when

fun main() {
//    Plantear una estructura que se repita 5 veces y dentro de la misma cargar 3 valores
//    enteros. Acumular solo el mayor del cada lista de tres valores.

    var contador = 0
    var acumulacion = 0
    for (i in 1..5) {
        contador++
        println("Cargar valores para lista: $contador")
        print("Ingresa el primer valor: ")
        var valor1 = readLine()!!.toInt()
        print("Ingresa el segundo valor: ")
        var valor2 = readLine()!!.toInt()
        print("Ingresa el tercer valor :")
        var valor3 = readLine()!!.toInt()

        when {
            valor1 > valor2 && valor1 > valor3 -> acumulacion+= valor1
            valor2 > valor1 && valor2 > valor3 -> acumulacion+= valor2
            valor3 > valor2 && valor3 > valor1 -> acumulacion+= valor3
            else -> println("No se acumulo XD")
        }
    }
    println("La acumulacion del valor mayor de cada lista es: $acumulacion")
}