package funciones_con_retorno_datos

fun largo(nombre: String): Int {
    return nombre.length
}

fun main() {
//    Confeccionar una función que le enviemos como parámetro un String y nos retorne la
//            cantidad de caracteres que tiene. En la función main solicitar la carga de dos nombres por
//    teclado y llamar a la función dos veces. Imprimir en la main cual de las dos palabras tiene
//    más caracteres.

    print("Ingrese un nombre:")
    val nombre1 = readLine()!!
    print("Ingrese otro nombre:")
    val nombre2 = readLine()!!
    if (largo(nombre1) == largo(nombre2))
        print("Los nombres: $nombre1 y $nombre2 tienen la misma cantidad de caracteres")
                else
    if (largo(nombre1) > largo(nombre2))
        print("$nombre1 es mas largo")
    else
        print("$nombre2 es mas largo")
}