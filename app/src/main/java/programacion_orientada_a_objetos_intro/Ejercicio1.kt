package programacion_orientada_a_objetos_intro

//Implementar una clase llamada Alumno que tenga como propiedades su nombre y su
//nota. Definir los métodos para inicializar sus propiedades por teclado, imprimirlos y
//mostrar un mensaje si está regular (nota mayor o igual a 4)
//Definir dos objetos de la clase Alumno.

class Alumno {
    var nombre = ""
    var nota = 0f

    fun inicializar(){
        println("Ingrese nombre del alumno: ")
        nombre = readLine()!!.toString()
        println("Ingrese la nota del alumno: ")
        nota = readLine()!!.toFloat()
    }

    fun mostrarResultado(){
        if (nota >= 4) println("Esta regular $nombre, su nota es: $nota") else println("Reprobado/a $nombre")
    }
}

fun main() {

    val alumno = Alumno()
    alumno.inicializar()
    alumno.mostrarResultado()
    println("*************************")
    val alumno2 = Alumno()
    alumno2.inicializar()
    alumno2.mostrarResultado()
}