package funciones_parametros_y_retorno_de_arreglos

fun numeroElementos():IntArray{
    print("Cuantos elementos desea cargar: ")
    val numero = readLine()!!.toInt()
    val cantidad = IntArray(numero)
    for (i in cantidad.indices){
        print("Ingrese el valor: ")
        cantidad[i] = readLine()!!.toInt()
    }
    return cantidad
}

fun suma(cantidad: IntArray){
    var suma = 0
    for (elemento in cantidad){
        suma+= elemento
    }
    println("La suma de los valores es: $suma")
}

fun main() {
//    Desarrollar un programa que permita ingresar un arreglo de n elementos, ingresar n
//    por teclado.
//    Elaborar dos funciones una donde se lo cree y cargue al arreglo y otra que sume todos
//    sus elementos y retorne dicho valor a la main donde se lo imprima.

    val cantidad = numeroElementos()
    suma(cantidad)
}