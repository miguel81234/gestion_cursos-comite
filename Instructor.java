public class Instructor extends Persona {
    private String especialidad;

    public Instructor(String nombre, String identificacion, String correo, String especialidad) {
        // Se llama al constructor de la clase padre (Persona)
        super(nombre, identificacion, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Sobrescritura del metodo abstracto para mostrar toda la info del instructor
    @Override
    public void mostrarInformacion() {
        System.out.println("--- Informacion del Instructor ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Identificacion: " + this.identificacion);
        System.out.println("Correo: " + this.correo);
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("----------------------------------");
    }
}
