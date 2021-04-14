package funciones

fun cargarValore(){
    print("Ingrese el primer valor: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el segundo valor: ")
    val valor2 = readLine()!!.toInt()
    print("Ingrese el tercer valor: ")
    val valor3 = readLine()!!.toInt()

    val menor = if (valor1 < valor2 && valor1 < valor3) println("El menor es $valor1")
                else if (valor2 < valor1 && valor2 < valor3) println("El menor es $valor2")
                else println("El menor es $valor3")

    println("El resultado es: $menor")
}

fun main() {
//    Desarrollar una función que solicite la carga de tres valores y muestre el menor. Desde
//            la función main del programa llamar 2 veces a dicha función (sin utilizar una estructura
//            repetitiva)

    cargarValore()
    cargarValore()
}