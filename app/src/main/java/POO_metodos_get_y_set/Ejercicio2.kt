package POO_metodos_get_y_set

//Plantear una clase llamada Dado. Definir una propiedad llamada valor que permita
//cargar un valor comprendido entre 1 y 6 si llega un valor que no está comprendido en
//este rango se debe cargar un 1.
//Definir dos métodos, uno que genere un número aleatorio entre 1 y 6 y otro que lo
//imprima.
//Al constructor llega el valor inicial que debe tener el dado (tratar de enviarle el número
//7)

class Dado (){

    var valor: Int = 0

        set(valor) {
            field = valor
            print("Ingresa un numero entre 1 y 6: ")
            field = readLine()!!.toInt()
        }

        get() {
            return field
        }

    var numero = 0
    fun aleatoria  (){
        if (valor < 1 && valor > 6){
           numero = 1
        }else {
            numero = ((Math.random() * 6) + 1).toInt()
        }
    }

    fun imprimir(){
        println("El numero generado es: $numero")
    }

}

fun main() {
    val dado = Dado()
    dado.valor = 0
    dado.aleatoria()
    dado.imprimir()
}