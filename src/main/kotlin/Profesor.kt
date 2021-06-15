class Profesor(nombre:String) : Persona(nombre), IProfesor {

    override fun responsabilidad() {
        println("Esta persona está enseñando")
    }

    override fun dictaClase() {
        println("Esta persona está dictando clases")
    }

    override fun registraAsistencia(nomAlumno: String, asistencia: Boolean) {

    }

    override fun registrarNota(nomAlumno: String, nota: Int) {

    }
}