package Models

val catego: Set<String> = setOf("Cabello", "Tratamientos Faciales", "Depilación", "Uñas", "Eyebrows/Lashes", "Tratamientos Corporales")
class Servicios (var categoria: String , val nombreServicio: String,val precio: Float){

}


/*val guardacate: MutableList<String> = mutableListOf()
val guardaservi: MutableList<String> = mutableListOf()
val guardaprec: MutableList<String> = mutableListOf()


}class Servicios(/*var categoria: String = "${cate()}",*/ var nombreServicio: String = "${servicio()}", var precio: String ="${precios()}") {
    init {
        println(
            """Su servicio se guardo satisfactorimente con los sogueintes datos 
            
            |Nombre de su establecimiento $nombreServicio
            |Precio: $precio")    """.trimMargin()
        )
    }

fun main(){
    val s = Servicios()
    println(guardacate)
    println(guardaservi)
    println(guardaprec)
}

/*fun cate() {
    println("Seleccione una categoria")
    println(catego)
    val x = readLine()!!.toString()
    if (catego == catego.filter { it == "$x" }) {
        guardacate.add("$x")
    } else {
        println("No se encontro categoria")
        cate()
    }
}*/

fun servicio(){
    println("Nombre de su establecimiento")
    val x= readLine()!!.toString()
    guardaservi.add("$x")
}
fun precios(){
    println("Costo de su Servicio")
    val x= readLine()?.toFloat()
    guardaprec.add("$x")
}*/

