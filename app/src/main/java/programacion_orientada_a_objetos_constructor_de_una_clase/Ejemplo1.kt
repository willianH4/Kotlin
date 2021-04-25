package programacion_orientada_a_objetos_constructor_de_una_clase

//Implementar una clase llamada Persona que tendrá como propiedades su nombre y edad.
//Plantear un constructor donde debe llegar como parámetros el nombre y la edad.
//Definir además dos métodos, uno que imprima las propiedades y otro muestre si es mayor
//de edad.

class Persona (var nombre: String, var edad: Int) {

    init {
        if (edad < 0)
            edad = 0
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    val persona1 = Persona("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
}

//class Persona (nombre: String, edad: Int) Forma concisa de definir el constructor