package funciones_con_parametro_valorpor_defecto

fun numeros(numero1: Int = 5, numero2:Int = 20, numero3:Int = 30) {
    var suma = 0
    for (i in 1..1){
        print("Ingrese el valor cuarto valor: ")
        var numero4 = readLine()!!.toInt()
        suma = numero1 + numero2 + numero3 + numero4
    }
    println("La suma de $numero1 + $numero2 + $numero3 es: $suma")
}

fun main() {
//    Confeccionar una función que reciba entre 2 y 5 enteros. La misma nos debe retornar
//    la suma de dichos valores. Debe tener tres parámetros por defecto.

    numeros(10, 10, 10)
}