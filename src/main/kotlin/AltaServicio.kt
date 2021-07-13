class AltaServicio {
    var nombreProveedor = ""
    var correoProveedor = ""
    var nombreCategoria = ""
    var nombreServicio = ""
    var precioServicio = 0


    fun registro(){
        if (nombreProveedor != null && correoProveedor != null && nombreCategoria != null){
            println("Servicio Registrado")
        }else{
            println("Revisa que todos los campos estén completos")
        }
    }
}