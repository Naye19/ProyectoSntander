package funciones

fun verifyAge(){
    print("Ingresa tu edad (escribe sólo el número):")
    val age= readLine()!!.toInt()
    if (age >= 18){
        println(" ----¡Felicidades! Has creado tu cuenta ----")
    } else {
        println("---- Debes ser mayor de edad para crear una cuenta ----")
    }
}