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
            println("Iniciar Sesión")
            println("Ingresa tu nombre de usuario:")
            user=readLine()?.toString() as String
            println("Ingresa tu contraseña:")
            pass=readLine()?.toString() as String
            validarusuario()
            println("##### Hola $user has iniciado sesión #####")
        }
        else->{
            println("Ingresa tu nombre de usuario:")
            user=readLine()?.toString() as String
            usuario.add("$user")

            println("Ingresa tu correo electrónico:")
            correo=readLine()?.toString() as String
            email.add("$correo")

            println("Ingresa tu contraseña:")
            pass=readLine()?.toString() as String
            contrasena.add("$pass")
            usuario
            email
            contrasena
            verifyAge()
            sesion()
        }

    }
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
    }else if(contrasena == contrasena.filter{it == "$pass"}){
    }else{
        println("Datos incorrectos")
        sesion()
    }
}
