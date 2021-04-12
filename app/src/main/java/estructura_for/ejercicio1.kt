package estructura_for

fun main() {
//    Confeccionar un programa que lea n pares de datos, cada par de datos corresponde a
//    la medida de la base y la altura de un triángulo. El programa deberá informar:
//    a) De cada triángulo la medida de su base, su altura y su superficie (la superficie se
//    calcula multiplicando la base por la altura y dividiendo por dos).
//    b) La cantidad de triángulos cuya superficie es mayor a 12.

    var contador = 0
    var superficieMayor = 0
    print("Ingres la cantidad de pares de datos a calcular: ")
    var cantidad = readLine()!!.toInt()

    for (i in 1..cantidad){
        contador++
        print("Ingrese la base del triangulo $contador: ")
        var base = readLine()!!.toDouble()
        print("Ingrese la altura: ")
        var altura = readLine()!!.toDouble()
        var superficie = (base * altura) / 2
        println("-- Datos del triangulo $contador --")
        println("La altura es: $altura")
        println("La base es: $base")
        println("La superficie es: $superficie")

        if (superficie > 12) {
            superficieMayor++
            println("Triangulos con superficie mayor a 12 son: $superficieMayor")
        }
    }
}