package funciones_con_parametro

fun mostrarMayor(v1: Int, v2: Int, v3: Int) {
    print("Mayor:")
    if (v1 > v2 && v1 > v3)
        println(v1)
    else
        if (v2 > v3)
            print(v2)
        else
            print(v3)
}

fun main() {
//    Confeccionar una función que reciba tres enteros y nos muestre el mayor de ellos. La carga
//    de los valores hacerlo por teclado en la función main.
    print("Ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    print("Ingrese segundo valor:")
    val valor2 = readLine()!!.toInt()
    print("Ingrese tercer valor:")
    val valor3 = readLine()!!.toInt()
    mostrarMayor(valor1, valor2, valor3)

}