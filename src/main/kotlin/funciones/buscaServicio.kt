package funciones
import java.text.DateFormat
import java.util.Date
import java.text.SimpleDateFormat
import Pago

val date = Date()
val hourFormat: DateFormat = SimpleDateFormat("HH:mm:ss")
val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy")
val pagarTarjeta = Pago(1729738412, "Naye", dateFormat.format(date), hourFormat.format(date), 6000f)
var desc: Float = 0f
var total: Float = 0f

fun buscaServicio(){



    val categorias = mapOf(1 to "Cabello", 2 to "Tratamientos Faciales", 3 to "Depilación", 4 to "Uñas", 5 to "Eyebrows/Lashes", 6 to "Tratamientos Corporales")
    val tfacial = mapOf(1 to "Limpieza", 2 to "Mascarillas", 3 to "Microdermoabrasión", 4 to "Radiofrecuencia")
    val cabello = mapOf(1 to "Corte de Pelo", 2 to "Tinte", 3 to "Balayage", 4 to "Extensiones", 5 to "Alaciado", 6 to "Permanentes", 7 to "Peinado")
    val depilacion = mapOf(1 to "Cera", 2 to "Láser", 3 to "Hilo")
    val unas = mapOf(1 to "Manicure", 2 to "Pedicure", 3 to "Gelish", 4 to "Acrílico")
    val eyebrows = mapOf(1 to "Extensión de pestañas", 2 to "Rizado de pestañas", 3 to "Microblading", 4 to "Diseño de cejas")
    val tcorporal = mapOf(1 to "Masajes", 2 to "Tratamientos reductivos")

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

        3 -> {
            for ((keys, values) in depilacion) {
                println("$keys - $values")
            }
            print("Selecciona un servicio: ")
            val servicio = readLine()!!.toInt()
        }

        4 -> {
            for ((keys, values) in unas) {
                println("$keys - $values")
            }
            print("Selecciona un servicio: ")
            val servicio = readLine()!!.toInt()
        }
        5 -> {
            for ((keys, values) in eyebrows) {
                println("$keys - $values")
            }
            print("Selecciona un servicio: ")
            val servicio = readLine()!!.toInt()
        }
        6 ->{
            for ((keys, values) in tcorporal) {
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
    total = qty*150f
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
        in 0..2 -> println("Para dos servicios o menos no aplica ningún descuento")
        in 3..5 -> {
            println("Obtuviste un descuento del 15%")
            desc = total * 1.15f
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        in 6..8 -> {
            println("Obtuviste un descuento del 20%")
            desc = total * 1.20f
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        in 9..11 -> {
            println("Obtuviste un descuento del 30%")
            desc = total * 1.30f
            println("")
            println("el total de tu compra con descuento incluido es igual a $ $desc")
        }
        else -> {
            println("No aplican descuentos por arriba de 11 servicios")
            desc = total * 1f
            println("El total de tu compra antes de descuento es de $ $desc")
        }

    }
pagar()

}

fun pagar() {
    println("Contratar servicio: ")
    println("1- Si   2-No")
    val b: Int = readLine()!!.toInt()
    when (b) {
        1 -> {
            println("Realizar pago")
            if (pagarTarjeta.saldo > 0) {
                println("Comenzando transaccion")
                if (pagarTarjeta.saldo >= desc) {
                    println("Haciendo pago")
                    val restante = (pagarTarjeta.saldo - desc).toInt()
                    println("Actualmente le quedan: $restante")
                } else {
                    println("Saldo insuficiente")
                }
            } else {
                println("No tiene saldo")
            }
        }
        else -> println("##### Terminó proceso #####")
    }
}
