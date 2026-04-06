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
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Identificacion: " + this.getIdentificacion());
        System.out.println("Correo: " + this.getCorreo());
        System.out.println("Especialidad: " + this.getEspecialidad());
        System.out.println("----------------------------------");
    }
}
