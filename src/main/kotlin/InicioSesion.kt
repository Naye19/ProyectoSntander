fun main(){
    saludar()
    sesion()
    //opcionesIniciales()
    //menuServicios()

}
var user: String = ""
var pass: String = ""
var correo: String = ""

val usuario: MutableList<String> = mutableListOf()
val contrasena: MutableList<String> = mutableListOf()
val email: MutableList<String> = mutableListOf()

fun saludar(){
    println("------------------------------------------------------------")
    println("----------------Bienvenido a BeatyFinder--------------------")
    println("------------------------------------------------------------")
}

fun sesion(){
    println("Selecciona una opción: ")
    println("1 - Iniciar Sesión")
    println("2 - Registrarse")
    val x= readLine()!!.toInt()
    when(x){
        1->{
            iniciarSesion()
            validarusuario()
            println("##### Hola $user has iniciado sesión #####")
        }
        2->{
            registarUsuario()
            verifyAge()
            sesion()
        }
        else->sesion()

    }
}

fun iniciarSesion(){
    println("Iniciar Sesión")
    println("Favor de ingresar tus datos para iniciar sesión.")
    println("Usuario:")
    user=readLine()?.toString() as String
    println("Contraseña:")
    pass=readLine()?.toString() as String
}

fun registarUsuario(){
    println("Registrarse")
    println("Usuario:")
    user=readLine()?.toString() as String
    usuario.add("$user")

    println("Correo electrónico:")
    correo=readLine()?.toString() as String
    email.add("$correo")

    println("Contraseña:")
    pass=readLine()?.toString() as String
    contrasena.add("$pass")
    usuario
    email
    contrasena
}

fun verifyAge(){
    println("Ingresa tu edad (escribe sólo el número):")
    val age= readLine()!!.toInt()
    if (age >= 18){
        println(" ----¡Felicidades! Has creado tu cuenta ----")
    } else {
        println("---- Debes ser mayor de edad para crear una cuenta ----")
    }
}

fun validarusuario(){
    if(usuario == usuario.filter{it == "$user"}){
    }
    if(contrasena == contrasena.filter{it == "$pass"}){
    }else{
        println("Datos incorrectos")
        sesion()
    }
}
