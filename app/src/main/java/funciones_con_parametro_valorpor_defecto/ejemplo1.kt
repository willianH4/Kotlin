package funciones_con_parametro_valorpor_defecto

fun tituloSubrayado(titulo: String, caracter: String = "*") {
    println(titulo)
    for(i in 1..titulo.length)
        print(caracter)
    println()
}

fun main() {
//    Confeccionar una función que reciba un String como parámetro y en forma opcional un
//            segundo String con un caracter. La función debe mostrar el String subrayado con el caracter
//            que indica el segundo parámetro

    tituloSubrayado("Sistema de Administracion")
    tituloSubrayado("Ventas", "-")
}