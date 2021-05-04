package POO_Objeto_Nombrado

//Crear un objeto local en la función main que permita tirar 5 dados y almacenar dichos
//valores en un arreglo. Definir una propiedad que almacene 5 enteros y tres métodos: uno
//que cargue los 5 elementos del arreglo con valores aleatorios comprendidos entre 1 y 6, otro
//que imprima el arreglo y finalmente otro que retorne el mayor valor del arreglo.

fun main() {
    val dados = object {
        val arreglo = IntArray(5)
        fun generar() {
            for(i in arreglo.indices)
                arreglo[i] = ((Math.random() * 6) + 1).toInt()
        }
        fun imprimir() {
            for(elemento in arreglo)
                print("$elemento - ")
            println();
        }
        fun mayor(): Int {
            var may = arreglo[0]
            for(i in arreglo.indices)
                if (arreglo[i] > may)
                    may = arreglo[i]
            return may
        }
    }
    dados.generar()
    dados.imprimir()
    print("Mayor valor:")
    println(dados.mayor())
}