package POO_Herencia

//Declarar una clase Dado que genere un valor aleatorio entre 1 y 6, mostrar su valor.
//Crear una segunda clase llamada DadoRecuadro que genere un valor entre 1 y 6,
//mostrar el valor recuadrado en asteríscos.
//Utilizar la herencia entre estas dos clases.

open class Dado(){
    var valor = 0
    fun generarAleatorio(){
        valor = ((Math.random() * 6) + 1).toInt()
        println(valor)
    }
}

class DadoRecuadro(): Dado(){
    fun imprimir(){
        println("** ${generarAleatorio()} **")
    }
}

fun main() {
    val dado = Dado()
    dado.generarAleatorio()
    val dadoRecuadro = DadoRecuadro()
    dadoRecuadro.imprimir()

}

