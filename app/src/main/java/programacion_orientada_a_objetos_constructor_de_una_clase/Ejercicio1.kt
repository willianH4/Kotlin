package programacion_orientada_a_objetos_constructor_de_una_clase

//Implementar una clase llamada Alumno que tenga como propiedades su nombre y su
//nota. Al constructor llega su nombre y nota.
//Imprimir el nombre y su nota. Mostrar un mensaje si está regular (nota mayor o igual a
//4)
//Definir dos objetos de la clase Alumno.

class Alumno (var nombre:String, var nota:Double){

    fun resultado(){
        if (nota >= 4) println("Su nota es regular") else println("Esta muy mal")
    }

    fun imprimirResultado(){
        println("El resultado segun su nota $nota es: ")
        resultado()
    }

}

fun main() {
    val alumno = Alumno("Juan Perez", 8.9)
    alumno.imprimirResultado()

    val alumno2 = Alumno("Maria", 3.9)
    alumno2.imprimirResultado()
}