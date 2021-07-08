fun ubicacion(){
    println("")
    println("##### Esta aplicación hace uso de la ubicación del dispositivo para el correcto funcionamiento ####")
    println("¿Deseas encender tu ubicación?")
    println("1 - Sí")
    println("2 - No")
    print("Ingresa únicamente el número de la opción seleccionada: ")
    val op = readLine()!!.toInt()
    when(op){
        1-> {println("#### Tu ubicación se activó correctamente ####")
            menu()
        }
        2-> {println("#### No fue posible encender tu ubicación ####")
            ubicacion()
        }
        else-> {
            println("")
            println("#### Selecciona una opción válida ####")
            ubicacion()
        }
    }

}
