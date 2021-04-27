package POO_colaboracion_de_clases
//Un banco tiene 3 clientes que pueden hacer depósitos y extracciones. También el banco
//requiere que al final del día calcule la cantidad de dinero que hay depositado.
//Lo primero que hacemos es identificar las clases:
//Podemos identificar la clase Cliente y la clase Banco.

class Cliente(var nombre: String, var monto: Float) {
    fun depositar(monto: Float) {
        this.monto += monto
    }
    fun extraer(monto: Float) {
        this.monto -= monto
    }
    fun imprimir() {
        println("$nombre tiene depositado la suma de $monto")
    }
}
class Banco {
    val cliente1: Cliente = Cliente("Juan", 0f)
    var cliente2: Cliente = Cliente("Ana", 0f)
    var cliente3: Cliente = Cliente("Luis", 0f)
    fun operar() {
        cliente1.depositar(100f)
        cliente2.depositar(150f)
        cliente3.depositar(200f)
        cliente3.extraer(150f)
    }
    fun depositosTotales() {
        val total = cliente1.monto + cliente2.monto + cliente3.monto
        println("El total de dinero del banco es: $total")
        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}

fun main() {
    val banco1 = Banco()
    banco1.operar()
    banco1.depositosTotales()
}