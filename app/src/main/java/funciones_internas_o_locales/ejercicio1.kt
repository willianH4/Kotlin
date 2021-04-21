package funciones_internas_o_locales

fun pares5() {
//    funcion interna retorna el mayor de los numeros ingresados
    fun numeros(numero1:Int, numero2:Int) = if (numero1 > numero2) println("el mayor es $numero1") else println("el mayor es $numero2")

    for (i in 1..5){
        print("Ingrese el numero 1: ")
        var numero1 = readLine()!!.toInt()
        print("Ingrese el numero 2: ")
        var numero2 = readLine()!!.toInt()

//        llamada a la funcion interna
        numeros(numero1, numero2)
    }
}

fun main() {
//    Confeccionar una función que permita cargar dos enteros y nos muestre el mayor de
//            ellos. Realizar esta actividad con 5 pares de valores.
//    Implementar una función interna que retorne el mayor de dos enteros.


pares5()
}