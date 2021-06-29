package Expresiones_lambda

//    Definir una función de orden superior llamada operar. Llegan como parámetro dos enteros y
//    una función. En el bloque de la función llamar a la función que llega como parámetro y
//    enviar los dos primeros parámetros.
//    Desde la función main llamar a operar y enviar distintas expresiones lambdas que permitan
//    sumar, restar y elevar el primer valor al segundo .

fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int) : Int{
    return fn(v1, v2)
}
fun main() {
    val suma = operar(2, 3, {x, y -> x + y})
    println(suma)

    val resta = operar(12, 2, {x, y -> x - y})
    println(resta)

    var elevarCuarta = operar(2, 4, {x, y ->
        var valor = 1
        for(i in 1..y)
            valor = valor * x
        valor
    })

    println(elevarCuarta)
}