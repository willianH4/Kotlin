package estructuras_condicional_anidadas

fun main() {
//    Un postulante a un empleo, realiza un test de capacitación, se obtuvo la siguiente
//    información: cantidad total de preguntas que se le realizaron y la cantidad de preguntas
//    que contestó correctamente. Se pide confeccionar un programa que ingrese los dos
//    datos por teclado e informe el nivel del mismo según el porcentaje de respuestas
//            correctas que ha obtenido, y sabiendo que:

    print("Ingrese total de preguntas del test: ")
    val preguntas = readLine()!!.toDouble()
    print("Contestadas correctamente: ")
    val correctas = readLine()!!.toDouble()

    val valor = (correctas / preguntas)
    val porcentaje = valor * preguntas

    val resultado = if (porcentaje >= 90) "Nivel maximo"
        else if (porcentaje >= 75 && porcentaje < 90) "Nivel medio"
        else if(porcentaje >= 50 && porcentaje < 75) "Nivel regular"
        else if (porcentaje < 50) "Nivel bajo" else "No hay nivel"

    println("Su porcentaje es $porcentaje y $resultado")
}