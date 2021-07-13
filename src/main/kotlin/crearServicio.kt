fun main(){
    val servicio1 = AltaServicio()

    print("Ingresa el nombre del proveedor:" )
    servicio1.nombreProveedor = readLine()!!.toString()
    print("Ingresa el correo del proveedor:" )
    servicio1.correoProveedor = readLine()!!.toString()
    print("Ingresa la Categoría del Servicio:" )
    servicio1.nombreCategoria = readLine()!!.toString()
    print("Ingresa el nombre del servicio:" )
    servicio1.nombreServicio = readLine()!!.toString()
    print("Ingresa el precio del servicio:" )
    servicio1.precioServicio = readLine()!!.toInt()


    servicio1.registro()

}

/*    fun resumenRegistro(){
        println("El servicio registrado tiene la siguientes características")
        println("Nombre del proveedor: ${servicio1.nombreProveedor}")
        println("Correo del proveedor: ${servicio1.correoProveedor}")
        println("Categoría del Servicio: ${servicio1.nombreCategoria}")
        println("Tipo de Servicio: ${servicio1.nombreServicio}")
        println("Precio del Servicio: ${servicio1.precioServicio}")
    }*/
