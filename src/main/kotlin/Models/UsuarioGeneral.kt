package Models

class UsuarioGeneral constructor(val usuario: String, private val contraseña:String, val correo: String) {
    var edad: Int = 0
        set(age){
            if (age >= 18){
                println(" ----¡Felicidades! Has creado tu cuenta ----")
            } else {
                println("---- Debes ser mayor de edad para crear una cuenta ----")
            }
        }
}
