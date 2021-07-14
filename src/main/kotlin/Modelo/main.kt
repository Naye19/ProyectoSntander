package Modelo
import java.text.DateFormat
import java.util.Date;
import java.text.SimpleDateFormat

fun main() {
    val date = Date()
    val hourFormat: DateFormat = SimpleDateFormat("HH:mm:ss")
    val dateFormat: DateFormat = SimpleDateFormat("dd/MM/yyyy")

    val nueva = Categoria(1, "Cabello")
    val nueva2 = Categoria(2, "Tratamientos faciales")
    val nueva3 = Categoria(3, "Depilación")
    val nueva4 = Categoria(4, "Uñas")
    val nueva5 = Categoria(5, "Eyebrows/Lashes")
    val nueva6 = Categoria(6, "Tratamientos corporales")

    val hola = Usuario("Andrea", "andrea@gamil.com", "123456789", 20)
    val local = Local("Uñas y mas", "Camila Pamela Castillo", "Paseos del lago II", nueva4, "manicure", 250)
    val pagarTarjeta = Pago(1729738412, hola, dateFormat.format(date), hourFormat.format(date), 6000f)

    val correo: String
    val password: String
    println("Hola Iniciar sesion")
    println("Ingrese correo:")
    correo = readLine()?.toString() as String
    println("Ingrese contrasena:")
    password = readLine()?.toString() as String
    if (hola.correo == correo && hola.password == password) {
        println("Bienvenido" + " " + hola.usuario)
        println("Desea prender ubicacion")
        println("1- Si     2- No")
        val x: Int = readLine()!!.toInt()
        when (x) {
            1 -> {
                println("Ubicacion prendida con exito")
                println("Inicio")
                println("Menu")
                println(
                    "1- Agregar local"
                            + "   2- Buscar"
                            + "   3- Configuracion"
                )
                val a: Int = readLine()!!.toInt()
                when (a) {
                    1 -> {
                        println("Agregar local: ")
                    }
                    2 -> {
                        println("Buscar local")
                        println("Ingrese nombre del local o categoria")
                        val busqueda: String = readLine()?.toString() as String
                        if (local.nombrelocal !== busqueda) {
                            println(
                                "Se encontro lugar con los siguientes datos "
                                        + ", Nombre del local " + local.nombrelocal + ""
                                        + ", Ubicacion: " + local.ubicacion + ""
                                        + ", Servicio que ofrece: " + local.servicios + ""
                                        + ", Precio: " + local.precio + ""
                            )

                            println("Contratar servicio: ")
                            println("1- Si   2-No")
                            val b: Int = readLine()!!.toInt()
                            when (b) {
                                1 -> {
                                    println("Realizar pago")
                                    if (pagarTarjeta.saldo > 0) {
                                        println("Comenzando transaccion")
                                        if (pagarTarjeta.saldo >= local.precio) {
                                            println("Haciendo pago")
                                            val restante = (pagarTarjeta.saldo - local.precio).toInt()
                                            println("Actualmente le quedan: $restante")
                                        } else {
                                            println("Saldo insuficiente")
                                        }
                                    } else {
                                        println("No tiene saldo")
                                    }
                                }
                            }
                        } else {
                            println("No existe local")
                        }
                    }
                }
            }
            2 -> {
                println("Intente de nuevo")
            }
            else -> println("Solo puede ingresar 1 o 2 ")
        }
    } else {
        println("Datos incorrectos")
    }

}