fun main(){
    saludar()
    sesion()
}
var user: String = ""
var pass: String = ""
var correo: String = ""
var negocio: String= ""
var precio: Double = 0.0

val usuario: MutableList<String> = mutableListOf()
val contrasena: MutableList<String> = mutableListOf()
val email: MutableList<String> = mutableListOf()

val ne: MutableList<String> = mutableListOf()
val per: MutableList<String> = mutableListOf()
val cor: MutableList<String> = mutableListOf()
val pre: MutableList<String> = mutableListOf()

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
            menu()
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
    println("1- Si")
    println("2- No")
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
            registranegocio()
        }
        2->{
            println("Configuración")
        }
        3->{
            println("Buscar Servicio")
            Busquecaser()
        }
        else-> {
            println("intente de nuevo")
            menu()}
    }
}

fun registranegocio(){
    println("Registrar un negocio")
    println("Nombre del Negocio: ")
    negocio = readLine()?.toString() as String
    ne.add("$negocio")
    println("Nombre completo")
    val persona = readLine()?.toString() as String
    per.add("$persona")
    println("Correo: ")
    println(email.last())
    cor.add("$email")
    println("Precio")
    precio = readLine()?.toDouble() as Double
    pre.add("$precio")
    println("¿Guardar datos?")
    println("1- Si")
    println("2- No")
    val x= readLine()!!.toInt()
    when(x){
        1->{println("Datos guardados") }
        2->{println("Proceso cancelado")
            menu()
        }
    }

}

fun Busquecaser(){
    val n = readLine()!!.toString()
    println("$n buscando")
    if(ne == ne.filter{it == "$n" }){
        println("$n Existe")
        println("Costo: $pre")
        //contratar()
    }else{
        println("$n no existe, intente de nuevo")
        Busquecaser()
    }
}

/*fun contratar(){
    println("Contratar servicio")
    println("1. Si")
    println("2. No")
    val x= readLine()!!.toInt()
    when(x){
        1->{
            pagar()
        }
        2->Busquecaser()
        else->contratar()
    }
}

fun pagar(saldo:Double = 100.0){
    if(saldo >= pre.filter{it == "$precio"}.toString()){
        val total = saldo.minus("$precio")
        println("Artículo comprado, saldo restante: $total pesos")
    }else {
        println("Necesitas saldo suficiente para poder comprar este producto")
    }
}*/

