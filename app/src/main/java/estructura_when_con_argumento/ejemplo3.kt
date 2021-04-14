package estructura_when_con_argumento

fun main() {
//    Ingresar 10 valores enteros por teclado. Contar cuantos de dichos valores ingresados fueron
//    cero y cuantos 1,5 o 10.

    var cant1 = 0
    var cant2 = 0
    for(i in 1..10) {
        print("Ingrese un valor entero:")
        val valor = readLine()!!.toInt()
        when (valor){
            0 -> cant1++
            1, 5, 10 -> cant2++
        }
    }
    println("Cantidad de números 0 ingresados: $cant1")
    println("Cantidad de números 1,2 o 3 ingresados: $cant2")
}