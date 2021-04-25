package programacion_orientada_a_objetos_constructor_de_una_clase

//Implementar una clase que cargue los lados de un triángulo e implemente los siguientes
//métodos: inicializar las propiedades, imprimir el valor del lado mayor y otro método que
//muestre si es equilátero o no.

class Triangulo (var lado1: Int, var lado2: Int, var lado3: Int){

    fun ladoMayor() {
        print("Lado mayor:")
        when {
            lado1 > lado2 && lado1 > lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            print("Es un triángulo equilátero")
        else
            print("No es un triángulo equilátero")
    }
}

fun main() {
    val triangulo1 = Triangulo(12, 45, 24)
    triangulo1.ladoMayor()
    triangulo1.esEquilatero()
}