package Arreglos_con_objetos

//Declarar una clase Persona con las propiedades nombre y edad, definir como métodos su
//impresión y otra que retorna true si es mayor de edad o false en caso contrario
//En la función main definir un arreglo con cuatro elementos de tipo Persona. Calcular cuantas
//personas son mayores de edad.

class Persona(val nombre: String, val edad: Int) {
    fun imprimir() {
        println("Nombre: $nombre Edad: $edad")
    }
    fun esMayor() = if (edad >= 18) true else false
}

fun main() {
    val personas: Array<Persona> = arrayOf(Persona("ana", 22), Persona("juan", 13), Persona("carlos", 6), Persona("maria", 72))
    println("Listado de personas")
    for(per in personas)
        per.imprimir()
    var cant = 0
    for(per in personas)
        if (per.esMayor())
            cant++
    println("Cantidad de personas mayores de edad: $cant")
}