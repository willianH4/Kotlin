package entrada_por_teclado

fun main() {
//    Realizar la carga del lado de un cuadrado, mostrar por pantalla el perímetro del mismo (El
//    perímetro de un cuadrado se calcula multiplicando el valor del lado por cuatro)

    print("Ingrese la medida del lado del cuadrado: ")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perimetro del cuadrado es $perimetro")
}