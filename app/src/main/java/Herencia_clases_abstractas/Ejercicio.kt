package Herencia_clases_abstractas

//Declarar una clase abstracta Cuenta y dos subclases CajaAhorra y PlazoFijo. Definir
//las propiedades y métodos comunes entre una caja de ahorro y un plazo fijo y
//agruparlos en la clase Cuenta.
//Una caja de ahorro y un plazo fijo tienen un nombre de titular y un monto. Un plazo fijo
//añade un plazo de imposición en días y una tasa de interés. Hacer que la caja de
//ahorro no genera intereses.
//En la función main del programa definir un objeto de la clase CajaAhorro y otro de la
//clase PlazoFijo.

abstract class Cuenta(var nombre:String, var monto:Double){

}

class CajaAhorro(nombre:String, monto: Double): Cuenta(nombre, monto){

}

class  PlazoFijo(nombre: String, monto: Double): Cuenta(nombre, monto){

}

fun main() {

}