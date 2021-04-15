package funciones_con_parametro

fun valores(valor1:Int, valor2:Int, valor3:Int){
   when {
       valor1 > valor2 && valor2 > valor3 -> println("ordenados: \n $valor1 \n $valor2 \n $valor3")
       valor2 > valor1 && valor1 > valor3 -> println("ordenados: \n $valor2 \n $valor1 \n $valor3")
       valor3 > valor2 && valor2 > valor1 -> println("ordenados: \n $valor3 \n $valor2 \n $valor1")
       else -> println("Error no se puede realizar el ordenamiento XD")
   }
}

fun main() {
//    Confeccionar una función que reciba tres enteros y los muestre ordenados de menor a
//            mayor. En la función main solicitar la carga de 3 enteros por teclado y proceder a
//    llamar a la primer función definida.

    print("Ingrese el valor 1: ")
    val valor1 = readLine()!!.toInt()
    print("Ingrese el valor 2: ")
    val valor2 = readLine()!!.toInt()
    print("Ingrese el valor 3: ")
    val valor3 = readLine()!!.toInt()

    valores(valor1, valor2, valor3)
}