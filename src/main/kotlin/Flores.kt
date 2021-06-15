class Flores {

    val autor = "Luis Angel"

    class ClaseAnidada
    {
        fun saludoClaseAnidada(nombre :String): String{
            return "Hola ${nombre}, soy una clase anidada"
        }
    }

    inner class ClaseInterna{

        fun saludoClaseInterna(nombre: String) :String{
            return "Hola ${nombre}, soy una clase interna de $autor"
        }
    }

}