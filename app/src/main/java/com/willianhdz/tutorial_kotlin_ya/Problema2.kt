package com.willianhdz.tutorial_kotlin_ya

fun main() {
//    Definir tres variables inmutables y cargar por asignación los pesos de tres personas
//    con valores Float. Calcular el promedio de pesos de las personas y mostrarlo.

    val pesoPersona1 = 120.1f
    val pesoPersona2 = 99.2f
    val pesoPersona3 = 110.4f

    var promedio = (pesoPersona1 + pesoPersona2 + pesoPersona3) / 3
    println("El promedio de peso de las 3 personas es $promedio")
}