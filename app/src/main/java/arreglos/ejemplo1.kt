package arreglos

fun main() {
//    Se desea guardar los sueldos de 5 operarios.
//    Según lo conocido deberíamos definir 5 variables si queremos tener en un cierto momento
//    los 5 sueldos almacenados en memoria.
//    Empleando un arreglo solo se requiere definir un único nombre y accedemos a cada
//            elemento por medio del subíndice.

    val sueldos: IntArray
    sueldos = IntArray(5)

//carga de sus elementos por teclado
    for(i in 0..4) {
        print("Ingrese sueldo:")
        sueldos[i] = readLine()!!.toInt()
    }

    println("Los salarios son: ")
//impresion de sus elementos
    for(i in 0..4) {
        println(sueldos[i])
    }
}

//Diferentes tipos de datos de arreglos
//ByteArray
//ShortArray
//LongArray
//FloatArray
//DoubleArray
//BooleanArray
//CharArray
//No hay uno para manejar String, en los próximos conceptos veremos como trabajar con este
//tipo de dato.
//Problem