package programacion_orientada_a_objetos_constructor_de_una_clase

//Cofeccionar una clase que represente un punto en el plano, la coordenada de un punto
//en el plano está dado por dos valores enteros x e y.
//Al constructor llega la ubicación del punto en x e y.
//Implementar un método que retorne un String que indique en que cuadrante se ubica
//dicho punto. (1º Cuadrante si x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, 3º Cuadrante:
//x < 0 Y y < 0, 4º Cuadrante: x > 0 Y y < 0)
//Si alguno o los dos valores son cero luego el punto se encuentra en un eje.
//Definir luego 5 objetos de la clase Punto en cada uno de los cuadrantes y uno en un
//eje.

class Punto (var valorX:Int, var valorY:Int){

    fun cuadrante(){
        when{
            valorX > 0 && valorY > 0 -> println("La cordenada es $valorX, $valorY esta en el cuadrante 1")
            valorX < 0 && valorY > 0 -> println("La cordenada es $valorX, $valorY esta en el cuadrante 2")
            valorX < 0 && valorY < 0 -> println("La cordenada es $valorX, $valorY esta en el cuadrante 3")
            valorX > 0 && valorY < 0 -> println("La cordenada es $valorX, $valorY esta en el cuadrante 4")
            valorX == 0 || valorY == 0 -> println("La cordenada es $valorX, $valorY esta en el eje.")
            else -> print("Siguiente.")
        }
    }
}

fun main() {

    val punto = Punto(10, 33)
    punto.cuadrante()
    val punto1 = Punto(-12, 90)
    punto1.cuadrante()
    val punto2 = Punto(-12, -112)
    punto2.cuadrante()
    val punto3 = Punto(120, -120)
    punto3.cuadrante()
    val punto4 = Punto(0, -190)
    punto4.cuadrante()

}