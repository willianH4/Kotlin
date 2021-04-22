package funciones_parametros_y_retorno_de_arreglos

fun cargarSueldos(): IntArray {
    print("Cuantos sueldos quiere cargar:")
    val cantidad = readLine()!!.toInt()
    val sueldos = IntArray(cantidad)
    for(i in sueldos.indices) {
        print("Ingrese elemento:")
        sueldos[i] = readLine()!!.toInt()
    }
    return sueldos
}

fun imprimirSueldos(sueldos: IntArray) {
    println("Listado de todos los sueldos")
    for(sueldo in sueldos)
        println(sueldo)
}

fun main() {
//    Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se debe pedir
//            la cantidad de sueldos a ingresar. Luego crear un arreglo con dicho tamaño.
//    Definir una función de carga y otra de impresión.

    val sueldos = cargarSueldos()
    imprimirSueldos(sueldos)
}