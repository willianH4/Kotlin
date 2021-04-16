package funciones_con_unica_expresion

fun convertirCastelano(valor: Int) = when (valor) {
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "cinco"
    else -> "error"
}

fun main() {
//    Confeccionar una función reciba un entero comprendido entre 1 y 5 y nos retorne en
//    castellano dicho número o un String con la cadena "error" si no está comprendido entre 1 y
//    5.

    for(i in 1..6)
        println(convertirCastelano(i))

}