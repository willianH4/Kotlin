package programacion_orientada_a_objetos_intro


//nombre y edad, y tres métodos (funciones), uno de dichos métodos inicializará las
//propiedades del nombre y la edad, otro método mostrará en la pantalla el contenido de las
//propiedades y por último uno que imprima si es mayor de edad.
//Definir dos objetos de la clase Persona.

class Persona {
    var nombre: String = ""
    var edad: Int = 0
    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
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
    val persona1: Persona
    persona1 = Persona()
    persona1.inicializar("Juan", 12)
    persona1.imprimir()
    persona1.esMayorEdad()
    val persona2: Persona
    persona2 = Persona()
    persona2.inicializar("Ana", 50)
    persona2.imprimir()
    persona2.esMayorEdad()
}