package funciones

import pass
import user

fun iniciarSesion(){
    println("")
    println("--------------------")
    println("|  Iniciar Sesión  |")
    println("--------------------")
    Thread.sleep(1000)
    println("Favor de ingresar tus datos para iniciar sesión.")
    print("Usuario:")
    user=readLine()?.toString() as String
    print("Contraseña:")
    pass=readLine()?.toString() as String
}
