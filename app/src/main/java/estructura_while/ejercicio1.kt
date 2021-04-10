package estructura_while

fun main() {
//    Escribir un programa que solicite ingresar 10 notas de alumnos y nos informe cuántos
//            tienen notas mayores o iguales a 7 y cuántos menores.

    var numero = 0
    var mayor = 0
    var menor = 0
    while (numero < 10) {
        numero++
        print("Ingresa la nota del alumno $numero: \n ")
        var nota = readLine()!!.toDouble()
        if (nota >= 7) {
            mayor++
        }else{
            menor++
        }
    }
    println("alumos con nota mayor a 7 son $mayor")
    println("alumos con nota menor a 7 son $menor")
}