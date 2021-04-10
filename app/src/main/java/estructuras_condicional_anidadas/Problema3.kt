package estructuras_condicional_anidadas

fun main() {
    print("Ingresa un numero de 3 cifras: ")
    val numero = readLine()!!.toInt()

    val resultado = if (numero >= 1 && numero <= 9) "Tiene 1 cifra"
        else if(numero <= 10 && numero <=99) "Tiene 2 cifras"
        else if (numero >= 100 && numero <= 999) "Tiene 3 cifras"
        else "Error! no se permiten mas de 3 cifras"

    println("El $numero tiene $resultado")
}