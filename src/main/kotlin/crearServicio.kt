fun crearServicio(){
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


