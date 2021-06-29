package Declaracion_e_implementacion_de_interfaces

//Definir una interface llamada Punto que declare un método llamado imprimir. Luego declarar
//dos clases que la implementen.

interface Punto {
    fun imprimir()
}

class PuntoPlano(val x: Int, val y: Int): Punto {
    override fun imprimir() {
        println("Punto en el plano: ($x,$y)")
    }
}

class PuntoEspacio(val x: Int, val y: Int, val z: Int): Punto {
    override fun imprimir() {
        println("Punto en el espacio: ($x,$y,$z)")
    }
}

fun main() {
    val puntoPlano1 = PuntoPlano(10, 4)
    puntoPlano1.imprimir()
    val puntoEspacio1 = PuntoEspacio(20, 50, 60)
    puntoEspacio1.imprimir()
}