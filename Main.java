import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Se crean dos Listas separadas en lugar de una sola, 
        // tal como se pidio para no usar polimorfismo al agrupar ambas en una.
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Instructor> listaInstructores = new ArrayList<>();

        System.out.println("=== SISTEMA DE GESTION DE CURSOS EN LINEA ===");
        
        // 1. Permitir el registro de personas (estudiantes e instructores)
        System.out.println("\n--- 1. Registrando personas ---");
        
        Estudiante est1 = new Estudiante("Juan Perez", "1001", "juan@correo.com", "Java Basico");
        Estudiante est2 = new Estudiante("Maria Lopez", "1002", "maria@correo.com", "Bases de Datos");
        listaEstudiantes.add(est1);
        listaEstudiantes.add(est2);
        System.out.println("-> Se han registrado 2 estudiantes.");

        Instructor inst1 = new Instructor("Carlos Gomez", "2001", "carlos@correo.com", "Programacion Backend");
        Instructor inst2 = new Instructor("Ana Martinez", "2002", "ana@correo.com", "Desarrollo Web");
        listaInstructores.add(inst1);
        listaInstructores.add(inst2);
        System.out.println("-> Se han registrado 2 instructores.");

        // 2. Mostrar la lista completa de personas registradas
        System.out.println("\n--- 2. Mostrando lista completa de personas ---");
        
        System.out.println("\n[ LISTA DE ESTUDIANTES ]");
        // Validacion basica si la lista esta vacia
        if (listaEstudiantes.size() == 0) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                listaEstudiantes.get(i).mostrarInformacion();
            }
        }

        System.out.println("\n[ LISTA DE INSTRUCTORES ]");
        if (listaInstructores.size() == 0) {
            System.out.println("No hay instructores registrados.");
        } else {
            for (int i = 0; i < listaInstructores.size(); i++) {
                listaInstructores.get(i).mostrarInformacion();
            }
        }

        // 3. Permitir la consulta individual de una persona a partir de su identificacion
        System.out.println("\n--- 3. Consultando persona por identificacion ---");
        
        // Puedes cambiar este valor para probar buscar un estudiante o un ID inexistente
        String idBuscar = "2001";
        System.out.println("Buscando identificacion: " + idBuscar);
        
        boolean encontrado = false;

        // Buscar primero en la lista de estudiantes
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante estudiante = listaEstudiantes.get(i);
            if (estudiante.getIdentificacion().equals(idBuscar)) {
                System.out.println("\nResultado: Persona encontrada (Estudiante)");
                estudiante.mostrarInformacion();
                encontrado = true;
                break;
            }
        }

        // Si no se encontro en estudiantes, buscar en instructores
        if (encontrado == false) {
            for (int i = 0; i < listaInstructores.size(); i++) {
                Instructor instructor = listaInstructores.get(i);
                if (instructor.getIdentificacion().equals(idBuscar)) {
                    System.out.println("\nResultado: Persona encontrada (Instructor)");
                    instructor.mostrarInformacion();
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("\nResultado: No se encontro ninguna persona con la ID: " + idBuscar);
        }
        
        System.out.println("\n=== FIN DE LA DEMOSTRACION ===");
    }
}
