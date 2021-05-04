package POO_Objeto_Nombrado

//Definir un objeto nombrado:
//object Mayor {
//    con tres métodos llamados "maximo" con dos parámetros cada uno. Los métodos
//    difieren en que uno recibe tipos de datos Int, otro de tipos Float y finalmente el último
//    recibe tipos de datos Double. Los tres métodos deben retornar el mayor de los dos
//    datos que reciben.

object Mayor{

    fun maximo1(valor1:Int, valor2:Int): Int{
        if (valor1 > valor2){
            return valor1
        }else{
            return valor2
        }
    }

    fun maximo2(valor1: Float, valor2: Float):Float {
        if (valor1 > valor2){
            return valor1
        }else{
            return valor2
        }
    }

    fun maximo3(valor1:Double, valor2: Double):Double {
        if (valor1 > valor2){
            return valor1
        }else{
            return valor2
        }
    }
}

fun main() {
    val maximo1 = Mayor.maximo1(12,22)
    val maximo2 = Mayor.maximo2(12.1F, 9.11F)
    val maximo3 = Mayor.maximo3(33.33, 99.12)

    println("Resultados:")
    println(maximo1)
}