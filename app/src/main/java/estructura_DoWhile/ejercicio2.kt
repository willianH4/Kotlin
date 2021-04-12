package estructura_DoWhile

fun main() {
//    En un banco se procesan datos de las cuentas corrientes de sus clientes. De cada
//            cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso de datos debe
//    finalizar al ingresar un valor negativo en el número de cuenta.
//    Se pide confeccionar un programa que lea los datos de las cuentas corrientes e
//            informe:
//    a)De cada cuenta: número de cuenta y estado de la cuenta según su saldo, sabiendo
//    que:
//    Estado de la cuenta 'Acreedor' si el saldo es >0.
//    'Deudor' si el saldo es <0.
//    'Nulo' si el saldo es =0.
//    b) La suma total de los saldos acreedores.

    var contador = 0
    var cuenta = 0
    var saldo = 0.0
    var estado = ""

    do {
        contador++
        print("Ingrese cuenta del cliente $contador: ")
        cuenta = readLine()!!.toInt()
        print("Ingrese el saldo de la cuenta del cliente $contador: ")
        saldo = readLine()!!.toDouble()
        if (saldo > 0){
            estado = "Acreedor"
        }else if (saldo < 0){
            estado = "Deudor"
        }else estado = "Nulo"

        print("-- Datos del cliente --")
        println("Numero de cuenta del cliente $contador: $cuenta")
        println("Saldo de la cuenta del cliente $contador: $saldo")
        println("El estado: $estado")

    }while (cuenta != -0)


}