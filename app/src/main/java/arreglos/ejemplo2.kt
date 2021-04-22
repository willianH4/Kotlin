package arreglos

fun main() {
//    Definir un arreglo de 5 componentes de tipo Float que representen las alturas de 5
//    personas.
//    Obtener el promedio de las mismas. Contar cuántas personas son más altas que el
//    promedio y cuántas más bajas.

    val alturas = FloatArray(5)
    var suma = 0f
    for(i in 0..alturas.size-1){
        print("Ingrese la altura:")
        alturas[i] = readLine()!!.toFloat()
        suma += alturas[i]
    }
    val promedio = suma / alturas.size
    println("Altura promedio: $promedio")
    var altos = 0
    var bajos = 0
    for(i in 0..alturas.size-1)
        if (alturas[i] > promedio)
            altos++
        else
            bajos++
    println("Cantidad de personas más altas que el promedio: $altos")
    println("Cantidad de personas más bajas que el promedio: $bajos")
}