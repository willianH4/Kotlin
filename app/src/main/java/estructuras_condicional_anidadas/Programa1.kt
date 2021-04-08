package estructuras_condicional_anidadas

fun main() {
//    Confeccionar un programa que pida por teclado tres notas de un alumno, calcule el
//    promedio e imprima alguno de estos mensajes:
//    Si el promedio es >=7 mostrar "Promocionado".
//    Si el promedio es >=4 y <7 mostrar "Regular".
//    Si el promedio es <4 mostrar "Reprobado".

    print("Ingrese primer nota:")
    val nota1 = readLine()!!.toInt()
    print("Ingrese segunda nota:")
    val nota2 = readLine()!!.toInt()
    print("Ingrese tercer nota:")
    val nota3 = readLine()!!.toInt()
    val promedio = (nota1 + nota2 + nota3) / 3
    if (promedio >= 7)
        print("Promocionado")
    else
        if (promedio >= 4)
            print("Regular")
        else
            print("Libre")
}