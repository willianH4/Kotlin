package funciones_internas_o_locales

fun multiplos2y5() {
    fun multiplo(numero: Int, valor: Int) = numero % valor == 0
    var mult2 = 0
    var mult5 = 0
    for(i in 1..10) {
        print("Ingrese valor:")
        val valor = readLine()!!.toInt()
        if (multiplo(valor, 2))
            mult2++
        if (multiplo(valor, 5))
            mult5++
    }
    println("Cantidad de múltiplos de 2 : $mult2")
    println("Cantidad de múltiplos de 5 : $mult5")
}

fun main() {
//    Confeccionar una función que permita ingresar 10 valores por teclado y contar cuantos son
//            múltiplos de 2 y cuantos son múltiplos de 5.

    multiplos2y5()
}