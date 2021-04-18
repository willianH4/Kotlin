package funciones_llamada_con_argumentos_nombrados

fun calcularSueldo(nombre: String, costoHora: Double, cantidadHoras: Int) {
    val sueldo = costoHora * cantidadHoras
    println("$nombre trabajó $cantidadHoras horas, se le paga por hora $costoHora por lo tanto le corresponde un sueldo de $sueldo")
}

fun main() {
//    Confeccionar una función que reciba el nombre de un operario, el pago por hora y la
//    cantidad de horas trabajadas. Debe mostrar su sueldo y el nombre. Hacer la llamada de la
//            función mediante argumentos nombrados.

    calcularSueldo("juan", 10.5, 120)
    calcularSueldo(costoHora = 12.0, cantidadHoras = 40, nombre="ana")
    calcularSueldo(cantidadHoras = 90, nombre = "luis", costoHora = 7.25)
}