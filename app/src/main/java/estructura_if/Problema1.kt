package estructura_if

fun main() {
//    Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete mostrar
//    un mensaje "Promocionado".
    print("Ingresa la nota 1: ")
    val nota1 = readLine()!!.toDouble()
    print("Ingresa la nota 2: ")
    val nota2 = readLine()!!.toDouble()
    print("Ingresa la nota 3: ")
    val nota3 = readLine()!!.toDouble()

    val promedio = (nota1 + nota2 + nota3) / 3
    if (promedio > 7) println("Felicidades has aprobado") else println("Reprobado")

}