package funciones

import registarUsuario
import user
import validarusuario

fun sesion() {
    val opcionesSesion = listOf(
        "     | 1 - Iniciar Sesión |",
        "     | 2 - Registrarse    |"
    )
    for (opcion in opcionesSesion) {
        println("")
        println(opcion)
    }
    println("")
    print("Selecciona una opción (Ingresa únicamente el número): ")
    val x = readLine()!!.toInt()
    when (x) {
        1 -> {
            inicioSesion()
            validarusuario()
            println("##### Hola $user has iniciado sesión #####")
            ubicacion()
            menu()
        }
        2 -> {
            registarUsuario()
            verifyAge()
            sesion()
        }
        else -> {
            println("")
            println("####### Favor de ingresar una opción válida ########")
            sesion()

        }
    }
}