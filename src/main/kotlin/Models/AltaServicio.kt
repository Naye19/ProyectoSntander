package Models
const val longitud = 10
class AltaServicio constructor(var nombreCompleto:String, val nombreServicio:String, var correo: UsuarioGeneral, var precio: Float, var edad:UsuarioGeneral){
    var numero: Long = 0
        set(value){
            if(value.toString().length == longitud){
                field = value
            } else{
                println("El número que ingresaste es incorrecto")
            }
        }
    fun actualizar(numero: Long,nombreCompleto: String,precio: Float){
        this.numero = numero
        this.nombreCompleto = nombreCompleto
        this.precio = precio
    }
}