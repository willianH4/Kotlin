package estructura_DoWhile

fun main() {
//    Realizar un programa que acumule (sume) valores ingresados por teclado hasta
//            ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga). Imprimir el
//            valor acumulado e informar si dicho valor es cero, mayor a cero o menor a cero.

    var suma = 0
    var contador = 0

    do {
        print("Ingrese un valor: ")
        val valor = readLine()!!.toInt()
        contador++
        if (valor != 9999){
            suma+= valor
        }else {
            println("Ha finalizado la carga")
        }
        println("La suma es $suma")
        val resultado = if (valor == 0) "El valor acumulado es 0" else if (valor > 0) "El valor acumulado es mayor a 0" else "El valor acumulado es menor a 0"
        println(resultado)

    }while (valor != 9999)

}