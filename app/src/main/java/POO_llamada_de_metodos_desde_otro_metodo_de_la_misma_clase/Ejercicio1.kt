package POO_llamada_de_metodos_desde_otro_metodo_de_la_misma_clase

//Declarar una clase llamada Hijos. Definir dentro de la misma un arreglo para
//almacenar las edades de 5 personas.
//Definir un método cargar donde se ingrese por teclado el arreglo de las edades y llame
//a otros dos método que impriman la mayor edad y el promedio de edades.

class Hijos {

    val edades = IntArray(5)
    var contador = 0
    fun cargar(){
        for (i in edades.indices){
            contador++
            print("Ingrese la edad de la persona $contador: ")
            edades[i] = readLine()!!.toInt()
        }
        mayor()
        promedio()
    }

    fun promedio(){
        var suma = 0
        for (edad in edades){
            suma+= edad
        }
        val promedio = suma / edades.size
        println("El promedio de edades es: $promedio")
    }

    fun mayor(){
       val mayor = edades.maxOrNull()
       println("La edad mayor es: $mayor")
    }
}

fun main() {
    val hijo = Hijos()
    hijo.cargar()
}