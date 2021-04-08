package entrada_por_teclado

fun main() {
//    Realizar un programa que lea por teclado cuatro valores numéricos enteros e informar
//    su suma y promedio.
    print("Ingrese el valor del numero 1: ")
    val numero1 = readLine()!!.toInt()
    print("Ingrese el valor del numero 2: ")
    val numero2 = readLine()!!.toInt()
    print("Ingrese el valor del numero 3: ")
    val numero3 = readLine()!!.toInt()
    print("Ingrese el valor del numero 4: ")
    val numero4 = readLine()!!.toInt()

    val suma = (numero1 + numero2 + numero3 + numero4)
    val promedio = (numero1 + numero2 + numero3 + numero4) / 4

    println("La suma de $numero1 + $numero2 + $numero3 + $numero4 es $suma")
    println("El promedio de los numeros ingresados es $promedio")
}