package POO_colaboracion_de_clases

//Plantear un programa que permita jugar a los dados. Las reglas de juego son:
//se tiran tres dados si los tres salen con el mismo valor mostrar un mensaje que "gano", sino
//"perdió".
//Lo primero que hacemos es identificar las clases:
//Podemos identificar la clase Dado y la clase JuegoDeDados.
//Luego las propiedades y los métodos de cada clase:

class Dado (var valor: Int){
    fun tirar() {
        valor = ((Math.random() * 6) + 1).toInt()
        imprimir()
    }
    fun imprimir() {
        println("Valor del dado: $valor")
    }
}
class JuegoDeDados {
    val dado1 = Dado(1)
    val dado2 = Dado(1)
    val dado3 = Dado(1)
    fun jugar() {
        dado1.tirar()
        dado2.tirar()
        dado3.tirar()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("Ganó")
        else
            print("Perdió")
    }
}

fun main() {
    val juego1 = JuegoDeDados()
    juego1.jugar()
}