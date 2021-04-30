package POO_metodos_get_y_set

//Confeccionar una clase que represente un Empleado. Definir como propiedades su
//nombre y su sueldo.
//No permitir que se cargue un valor negativo en su sueldo.
//Codificar el método imprimir en la clase.

class Empleado {
    var nombre: String = ""

        set(valor) {
            field = valor
        }

        get() {
            return field
        }

    var sueldo: Double = 0.0

        set(valor) {
            when {
                valor >= 0.0 -> field = valor
                else -> println("Ingresa un sueldo valido")
            }
        }

        get() {
            return field
        }

    fun imprimirEmpleado(){
        println("********* Info del emplado *********")
        println("Nombre empleado: $nombre")
        if (sueldo > 0.0) println("Sueldo empleado: $sueldo") else println("El sueldo no puede ser numero negativo")
    }

}

fun main() {
    val empleado = Empleado()
    empleado.nombre = "Willian"
    empleado.sueldo = 112.12
    empleado.imprimirEmpleado()
}