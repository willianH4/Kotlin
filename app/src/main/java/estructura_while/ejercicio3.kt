package estructura_while

fun main() {
//    En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
//    realizar un programa que lea los sueldos que cobra cada empleado e informe cuántos
//            empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el
//    programa deberá informar el importe que gasta la empresa en sueldos al personal.

    print("Ingrese cantidad de empleados: ")
    val cantidad = readLine()!!.toInt()

//    contadores
    var empleado = 0
    var sumaSalarios = 0.0
    var rango1 = 0
    var rango2 = 0

    while (empleado < cantidad) {
        empleado++
        print("Ingrese el sueldo del empleado $empleado: ")
        var salario = readLine()!!.toDouble()
        if (salario >= 100 && salario <= 300) {
            rango1++
        }else if (salario > 300) {
            rango2++
        }
        sumaSalarios+= salario
    }

    val totalSueldos = sumaSalarios
    println("El total de empleados que ganan entre 100 y 300 son: $rango1")
    println("El total de empleados que ganan mas de 300 son: $rango2")
    println("El gasto total en salarios es: $totalSueldos")
}