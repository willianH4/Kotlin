package funciones_con_parametro

fun mostrarPerimetro(lado: Int) {
    val perimetro = lado *4
    println("El perímetro es $perimetro")
}
fun mostrarSuperficie(lado: Int) {
    val superficie = lado * lado
    println("La superficie es $superficie")
}

fun main() {
//    Desarrollar un programa que permita ingresar el lado de un cuadrado. Luego preguntar si
//    quiere calcular y mostrar su perímetro o su superficie.
    print("Ingrese el valor del lado de un cuadrado:")
    val la = readLine()!!.toInt()
    print("Quiere calcular el perimetro o la superficie[ingresar texto: perimetr o/superficie]")
    var respuesta = readLine()!!
    when (respuesta){
        "perimetro" -> mostrarPerimetro(la)
        "superficie" -> mostrarSuperficie(la)
    }
}