package POO_Objeto_Nombrado

//Definir un objeto llamada Matematica con una propiedad que almacene el valor de PI y un
//método que retorne un valor aleatorio en un determinado rango.

object Matematica {
    val PI = 3.1416
    fun aleatorio(minimo: Int, maximo: Int) = ((Math.random() * (maximo + 1 - minimo)) + minimo).toInt()
}
fun main() {
    println("El valor de Pi es ${Matematica.PI}")
    print("Un valor aleatorio entre 5 y 10: ")
    println(Matematica.aleatorio(5, 10))
}