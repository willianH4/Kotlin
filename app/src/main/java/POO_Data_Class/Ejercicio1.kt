package POO_Data_Class

//Plantear un data class llamado Dado con una única propiedad llamada valor.
//Sobreescribir el método toPrint para que muestre tantos asteriscos como indica la
//propiedad valor.

data class Dado(var valor:Int){

    override fun toString(): String {
        var asterisco = ""
        for (i in 1..valor-1){
            asterisco = "*"
            print(asterisco + " ")
        }
        return asterisco
    }
}

fun main() {
    var dado = Dado(8)
    println(dado)
}
