fun main() {


    val categorias = mapOf(1 to "Cabello", 2 to "Tratamientos Faciales", 3 to "Uñas")
    val tfacial = mapOf(1 to "Limpieza", 2 to "Mascarillas")
    val cabello = mapOf(1 to "Corte de Pelo", 2 to "Tinte", 3 to "Extensiones")

    println("###### ENCUENTRA EL SERVICIO QUE ESTÉS BUSCANDO ###########")

    for ((keys, values) in categorias) {
        println("$keys - $values")
    }

    print("Selecciona una categoría: ")
    val categoria = readLine()!!.toInt()

    when (categoria) {
        1 -> {
            for ((keys, values) in cabello) {
                println("$keys - $values")
            }
            print("Selecciona un servicio: ")
            val servicio = readLine()!!.toInt()
        }

        2 -> {
            for ((keys, values) in tfacial) {
                println("$keys - $values")
            }
            print("Selecciona un servicio: ")
            val servicio = readLine()!!.toInt()
        }

        else -> {
            println("Intenta otra opción")
        }
    }

    print("Selecciona la cantidad: ")
    val qty = readLine()!!.toInt()
    val total = qty*150
    Thread.sleep(1000)
    println("#################################################################################")
    println("Por temporada de promoción cualquiera de los servicios tiene un costo de $150 pesos")
    println("#################################################################################")
    println("")
    Thread.sleep(1000)
    println("El total de tu compra antes de descuento es de $ $total")
    println("")
    println("#################################################################################")
    println("Por temporada de promoción tenemos algunos descuentos adicionales, descubre si te toca alguno")
    println("#################################################################################")
    Thread.sleep(1000)

    when(qty){
        in 0..2 -> println("Para dos servicios o menos no aplica ningún desceunto")
        in 3..5 -> {
            println("Obtuviste un descuento del 15%")
            val desc = total * 1.15
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        in 6..8 -> {
            println("Obtuviste un descuento del 20%")
            val desc = total * 1.20
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        in 9..11 -> {
            println("Obtuviste un descuento del 30%")
            val desc = total * 1.30
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        else -> {
            println("No aplican descuentos por arriba de 11 servicios")
            println("El total de tu compra antes de descuento es de $ $total")
        }
    }
    println("¿Continuar al pago?")
    println("1 - Sí")
    println("2 - No, seguir comprando")

}

