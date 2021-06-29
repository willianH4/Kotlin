package Funciones_orden_superior

//    Declarar una clase que almacene el nombre y la edad de una persona. Definir un método
//    que retorne true o false según si la persona es mayor de edad o no. Esta función debe
//    recibir como parámetro una función que al llamarla pasando la edad de la persona retornara
//    si es mayor o no de edad.
//    Tener en cuenta que una persona es mayor de edad en Estados Unidos si tiene 21 o más
//    años y en Argentina si tiene 18 o más años.

class Persona(val nombre: String, val edad: Int) {
    fun esMayor(fn:(Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

fun mayorEstadosUnidos(edad: Int): Boolean {
    if (edad >= 21)
        return true
    else
        return false
}

fun mayorArgentina(edad: Int): Boolean {
    if (edad >= 18)
        return true
    else
        return false
}

fun main() {
    val persona1 = Persona("juan", 18)
    if (persona1.esMayor(::mayorArgentina))
        println("${persona1.nombre} es mayor si vive en Argentina")
    else
        println("${persona1.nombre} no es mayor si vive en Argentina")
    if (persona1.esMayor(::mayorEstadosUnidos))
        println("${persona1.nombre} es mayor si vive en Estados Unidos")
    else
        println("${persona1.nombre} no es mayor si vive en Estados Unidos")
}