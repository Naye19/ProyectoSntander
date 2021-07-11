import funciones.saludar
import funciones.sesion
import java.awt.SystemColor.menu

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

fun registarUsuario(){
    println("Registrarse")
    print("Usuario:")
    user=readLine()?.toString() as String
    usuario.add("$user")

    print("Correo electrónico:")
    correo=readLine()?.toString() as String
    email.add("$correo")

    print("Contraseña:")
    pass=readLine()?.toString() as String
    contrasena.add("$pass")
    usuario
    email
    contrasena
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
    println("1- Sí")
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

