package POO_metodos_get_y_set

//Declarar una clase llamada persona con dos propiedades que almacenen el nombre y la
//edad de la persona. En la propiedad nombre almacenar siempre en mayúscula el nombre y
//cuando se recupere su valor retornarlo entre paréntesis, también controlar que no se pueda
//ingresar una edad con valor negativo, en dicho caso almacenar un cero.

class Persona {
    var nombre: String = ""
        set(valor) {
            field = valor.toUpperCase()
        }
        get() {
            return "(" + field + ")"
        }
    var edad: Int = 0
        set(valor) {
            if (valor >= 0)
                field = valor
            else
                field = 0
        }
}

fun main() {
    val persona1 = Persona()
    persona1.nombre = "juan"
    persona1.edad = 23
    println(persona1.nombre) // Se imprime: (JUAN)
    println(persona1.edad) // Se imprime: 23
    persona1.edad = -50
    println(persona1.edad) // Se imprime: 0
}