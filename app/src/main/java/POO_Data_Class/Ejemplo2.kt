package POO_Data_Class

//Declarar un data class llamado Persona que almacene el nombre y la edad. Sobreescribir el
//método toString para retornar un String con la concatenación del nombre y la edad
//separadas por una coma.

data class Persona(var nombre: String, var edad: Int) {

    override fun toString(): String {
        return "$nombre, $edad"
    }

}

fun main() {
    var persona1 = Persona("Juan", 22)
    var persona2 = Persona("Ana", 59)
    println(persona1)
    println(persona2)
}