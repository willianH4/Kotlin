package funciones_llamada_con_argumentos_nombrados

fun tabla(parametro1: Int, parametro2: Int = 10) {
    var contador = 0
    println("*** La tabla de multiplicar es: ***")
    for (i in 1..parametro2) {
        contador++
        val resultado = parametro1 * contador
        println("$parametro1 * $contador = $resultado")
    }
}

fun main() {
//    Elaborar una función que muestre la tabla de multiplicar del valor que le enviemos
//            como parámetro. Definir un segundo parámetro llamado termino que por defecto
//            almacene el valor 10. Se deben mostrar tantos términos de la tabla de multiplicar como
//    lo indica el segundo parámetro.
//    Llamar a la función desde la main con argumentos nombrados.

    tabla(5)
    tabla(4, 5)
    tabla(parametro2 = 3, parametro1 = 10)
    
}