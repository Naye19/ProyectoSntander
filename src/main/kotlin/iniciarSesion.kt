fun iniciarSesion(){
    println("")
    println("--------------------")
    println("|  Iniciar Sesión  |")
    println("--------------------")
    println("Favor de ingresar tus datos para iniciar sesión.")
    print("Usuario:")
    user=readLine()?.toString() as String
    print("Contraseña:")
    pass=readLine()?.toString() as String
}
