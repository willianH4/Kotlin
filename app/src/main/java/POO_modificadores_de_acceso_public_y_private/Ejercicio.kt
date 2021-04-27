package POO_modificadores_de_acceso_public_y_private

//Desarrollar una clase que defina una propiedad privada de tipo arreglo de 5 enteros.
//En el bloque init llamar a un método privado que cargue valores aleatorios
//comprendidos entre 0 y 10.
//Definir otros tres métodos públicos que muestren el arreglo, el mayor y el menor
//elemento.

class Ejercicio {

    private var valor: Int = 0
    private var arreglo = IntArray(5)

    init {
        numerosAleatorios()
    }

    private fun numerosAleatorios() {
        valor = ((Math.random() * 10) + 0).toInt()
        var contador = 0
        for (i in arreglo.indices){
            contador++
            valor = ((Math.random() * 10) + 0).toInt()
            arreglo[i] = valor
        }
    }

    fun mayorElemento(){
        val mayor = arreglo.maxOrNull()
        println("El mayor elemento es: $mayor")
    }

    fun menorElemento(){
        val menor = arreglo.minOrNull()
        println("El menor elemento es $menor")
    }
}

fun main() {
    val ejercicio = Ejercicio()
    ejercicio.mayorElemento()
    ejercicio.menorElemento()
}