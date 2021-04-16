package funciones_con_unica_expresion

fun longitud(nombre:String) = nombre.length

fun main() {
//    Confeccionar una función que le enviemos como parámetro un String y nos retorne la
//            cantidad de caracteres que tiene. En la función main solicitar la carga de dos nombres
//            por teclado y llamar a la función dos veces. Imprimir en la main cual de las dos
//            palabras tiene más caracteres.

    print("Ingrese el primer nombre: ")
    val nombre1 = readLine()!!.toString()
    print("Ingrese el segundo nombre: ")
    val nombre2 = readLine()!!.toString()

    if (longitud(nombre1) > longitud(nombre2))
        println("$nombre1 tiene mas caracteres ${longitud(nombre1)}")
    else
        println("$nombre2 tiene mas caracteres ${longitud(nombre2)}")
}