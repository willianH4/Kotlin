package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Escribir un programa que pida ingresar la coordenada de un punto en el plano, es decir
//    dos valores enteros x e y (distintos a cero).
//    Posteriormente imprimir en pantalla en que cuadrante se ubica dicho punto. (1º
//            Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)

    print("Ingresa el punto x: ")
    val numero1 = readLine()!!.toInt()
    print("Ingresa el punto y: ")
    val numero2 = readLine()!!.toInt()

    if (numero1 > 0 && numero2 > 0){
        println("Esta en cuadrante X")
    }else{
        if (numero1 < 0 && numero2 > 0){
            println("Es el cuadrante 2")
        }else {
            println("Es cuadrante 3 o 4")
        }
    }
}