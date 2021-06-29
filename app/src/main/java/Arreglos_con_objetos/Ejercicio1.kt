package Arreglos_con_objetos

//Se tiene la declaración del siguiente data class:
//        data class Articulo(val codigo: Int, val descripcion: String, var precio:
//Float)
//Definir un Array con 4 elmentos de tipo Articulo.
//Implementar dos funciones, una que le enviemos el Array y nos muestre todos sus
//componentes, y otra que también reciba el Array de artículos y proceda a aumentar en
//10% a todos los productos.

data class Articulo(val codigo: Int, val descripcion: String, var precio: Float)

val articulos: Array<Articulo> = arrayOf(Articulo(1, "Manzana verde", 1.99F), Articulo(1, "Mp3 Player", 99.33F),
        Articulo(3, "Pantalla LCD", 350.99F), Articulo(4, "Aceite de motocicleta", 9.99F)
);

fun mostraTodo(articulos: Array<Articulo>) {
    for (art in articulos){
        println("Datos del articulo: ")
        println("Codigo: "+ art.codigo)
        println("Descripcion: " + art.descripcion)
        println("Precio :" + art.precio)
    }
}

fun aumentarPrecio(articulos: Array<Articulo>){
    var contador = 0;
    var aumento = 0F;
    for (art in articulos){
        aumento = art.precio * 0.10F
        art.precio = art.precio + aumento
        println("Nuevo precio ${art.descripcion} :" + art.precio)
    }
}

fun main() {

    mostraTodo(articulos)
    println("*****************************")
    aumentarPrecio(articulos)
}