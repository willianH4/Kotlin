package funciones_con_parametro

fun claves(clave1:String, clave2:String) {
    val resultado = if ( clave1 == clave2) println("Las claves ingresadas son iguales")
                    else println("Las claves no son iguales")

    println(resultado)
}

fun main() {
//    En la función main solicitar que se ingrese una clave dos veces por teclado.
//    Desarrollar una función que reciba dos String como parametros y muestre un mensaje
//    si las claves ingresadas son iguales o distintas

    print("Ingrese la clave: ")
    val clave1 = readLine()!!.toString()
    print("Confirme la clave: ")
    val clave2 = readLine()!!.toString()

    claves(clave1, clave2)
}