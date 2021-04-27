package POO_colaboracion_de_clases

class Club {
    val socio1 = Socio("Willian", 15)
    val socio2 = Socio("Juan", 20)
    val socio3 = Socio("Maria", 2)

    fun socioMasAntiguo(){
        when{
            socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad -> println("El socio mas antiguo es ${socio1.nombre}")
            socio2.antiguedad > socio1.antiguedad && socio2.antiguedad > socio3.antiguedad -> println("El socio mas antiguo es ${socio2.nombre}")
            else -> println("El socio mas antiguo es ${socio3.nombre}")
        }
    }
}