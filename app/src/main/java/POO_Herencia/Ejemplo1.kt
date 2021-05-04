package POO_Herencia

//Plantear una clase Persona que contenga dos propiedades: nombre y edad. Definir como
//responsabilidades el constructor que reciba el nombre y la edad.
//En la función main del programa definir un objeto de la clase Persona y llamar a sus
//métodos.
//Declarar una segunda clase llamada Empleado que herede de la clase Persona y agregue
//una propiedad sueldo y muestre si debe pagar impuestos (sueldo superior a 3000)
//También en la función main del programa crear un objeto de la clase Empleado.

open class Persona(val nombre: String, val edad: Int) {
    open fun imprimir() {
        println("Nombre: $nombre")
        println("Edad: $edad")
    }
}
class Empleado(nombre: String, edad: Int, val sueldo: Double): Persona(nombre, edad) {
    override fun imprimir() {
        super.imprimir()
        println("Sueldo: $sueldo")
    }
    fun pagaImpuestos() {
        if (sueldo > 3000)
            println("El empleado $nombre paga impuestos")
        else
            println("El empleado $nombre no paga impuestos")
    }
}
fun main() {
    val persona1 = Persona("Jose", 22)
    println("Datos de la persona")
    persona1.imprimir()
    val empleado1 = Empleado("Ana", 30, 5000.0)
    println("Datos del empleado")
    empleado1.imprimir()
    empleado1.pagaImpuestos()
}