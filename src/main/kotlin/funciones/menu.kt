package funciones

import Busquecaser
import crearServicio
import registranegocio

fun menu(){
    val opcionesMenu = listOf(
        "     | 1 - Buscar Servicio  |",
        "     | 2 - Brindar Servicio |",
        "     | 3 - Configuración    |"
    )
    println("")
    println("---------------------")
    println("|   Menú Principal  |")
    println("---------------------")
    for(opcion in opcionesMenu){
        println(opcion)
    }
    println("")
    print("Selecciona una opción del menú (Ingresa únicamente el número): ")
    val x= readLine()!!.toInt()
    when(x){
        1-> {
            println("")
            println("#### Buscar Servicio ####")
            buscaServicio()
        }
        2->{
            println("")
            println("#### Brindar Servicio ####")
            crearServicio()
        }
        3->{
            println("")
            println("Configuración")
            println("#### Sitio en construcción ####")
        }
        else-> {
            println("")
            println("#### Intenta de nuevo ####")
            menu()}
    }
}
