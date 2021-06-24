fun main(){
    saludar()
    sesion()
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
            ubicacion()
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

fun ubicacion(){
    println("¿Desea encender su ubicación?")
    val op = readLine()!!.toInt()
    when(op){
        1-> {println("Su ubicacion se activo correctamente")
            menu()
        }
        2-> {println("No fue posible encender su ubicación ")
            ubicacion()
        }
        else-> println("Seleccione una opcion valida")
    }

}

fun menu(){
    println("Menu")
    println("1. Registrar negocio")
    println("2. Configuracion")
    println("3. Buscar servicio")
    val x= readLine()!!.toInt()
    when(x){
        1-> {
            println("Registrar negocio")
        }
        2->{
            println("Configuración")
        }
        3->{
            println("Buscar Servicio")
        }
        else-> menu()
    }
}

