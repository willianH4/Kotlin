package com.willianhdz.tutorial_kotlin_ya

fun main() {
    val valor1 = 100
    val valor2 = 400
    var resultado = valor1 + valor2
    println("La suma de $valor1 + $valor2 es $resultado")
    resultado = valor1 * valor2
    println("La multiplicaion de $valor1 * $valor2 es $resultado")

//    recomendacion para trabajar con double o float
//    ejemplo var peso = 21.22 // infiere que es double
//    val altura = 10.22f //debemos agregarle la f o F al final para indicarle que es un float
//    val titulo = "sistema de facturacion" // para tipo string
}