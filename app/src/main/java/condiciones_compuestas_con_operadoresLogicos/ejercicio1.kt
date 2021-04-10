package condiciones_compuestas_con_operadoresLogicos

fun main() {
//    Realizar un programa que pida cargar una fecha cualquiera, luego verificar si dicha
//    fecha corresponde a Navidad.

    print("Ingrese el dia: ")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readLine()!!.toInt()
    print("Ingrese el anio: ")
    val anio = readLine()!!.toInt()

    if (dia === 24 && mes === 12) println("Es navidad $dia/$mes/$anio") else println("No es navidad")
}