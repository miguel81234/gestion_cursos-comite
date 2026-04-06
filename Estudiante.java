public class Estudiante extends Persona {
    private String cursoInscrito;

    public Estudiante(String nombre, String identificacion, String correo, String cursoInscrito) {
        // Se llama al constructor de la clase padre (Persona)
        super(nombre, identificacion, correo);
        this.cursoInscrito = cursoInscrito;
    }

    public String getCursoInscrito() {
        return cursoInscrito;
    }

    public void setCursoInscrito(String cursoInscrito) {
        this.cursoInscrito = cursoInscrito;
    }

    // Sobrescritura del metodo abstracto para mostrar toda la info del estudiante
    @Override
    public void mostrarInformacion() {
        System.out.println("--- Informacion del Estudiante ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.identificacion);
        System.out.println("Correo: " + this.correo);
        System.out.println("Curso Inscrito: " + this.cursoInscrito);
        System.out.println("----------------------------------");
    }
}
