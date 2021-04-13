package estructura_condicional_when

fun main() {
//    Realizar un programa que lea los lados de n triángulos, e informar:
//    a) De cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
//    isósceles (dos lados iguales), o escaleno (ningún lado igual)
//    b) Cantidad de triángulos de cada tipo.

    print("Ingrese la cantidad de triangulos a identificar: ")
    val cantidad = readLine()!!.toInt()

    var contador = 0
    var totalEquilateros = 0
    var totalIsosceles = 0
    var totalEscalenos = 0
    for (i in 1..cantidad) {
        contador++
        println("Datos del triangulo: $contador")
        println("Ingrese el lado 1: ")
        val lado1 = readLine()!!.toDouble()
        println("Ingrese el lado 2: ")
        val lado2 = readLine()!!.toDouble()
        println("Ingrese el lado 3: ")
        val lado3 = readLine()!!.toDouble()

        when {
            lado1 == lado2 && lado1 == lado3 && lado2 == lado3 -> {
                println("El triangulo es equilatero")
                totalEquilateros++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("El triangulo es isosceles")
                totalIsosceles++
            }
            lado1 != lado2 || lado1 != lado3 -> {
                println("El triangulo es escaleno")
                totalEscalenos++
            }
            else -> "No identificaco"
        }
    }

    println("-- Tipos de triangulos identificados --")
    println("Total de Equilateros: $totalEquilateros")
    println("Total de Isosceles: $totalIsosceles")
    println("Total de Escalenos: $totalEscalenos")
}