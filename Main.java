import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        ArrayList<Instructor> listaInstructores = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== SISTEMA DE GESTION DE CURSOS ===");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Instructor");
            System.out.println("3. Mostrar Personas");
            System.out.println("4. Buscar por ID");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.println("\n--- REGISTRAR ESTUDIANTE ---");

                    System.out.print("Nombre: ");
                    String nombreE = sc.nextLine();

                    System.out.print("ID: ");
                    String idE = sc.nextLine();

                    System.out.print("Correo: ");
                    String correoE = sc.nextLine();

                    System.out.print("Curso: ");
                    String curso = sc.nextLine();

                    listaEstudiantes.add(new Estudiante(nombreE, idE, correoE, curso));
                    System.out.println(" Estudiante registrado");
                    break;

                case 2:
                    System.out.println("\n--- REGISTRAR INSTRUCTOR ---");

                    System.out.print("Nombre: ");
                    String nombreI = sc.nextLine();

                    System.out.print("ID: ");
                    String idI = sc.nextLine();

                    System.out.print("Correo: ");
                    String correoI = sc.nextLine();

                    System.out.print("Especialidad: ");
                    String especialidad = sc.nextLine();

                    listaInstructores.add(new Instructor(nombreI, idI, correoI, especialidad));
                    System.out.println("Instructor registrado");
                    break;

                case 3:
                    System.out.println("\n--- LISTA DE ESTUDIANTES ---");
                    if (listaEstudiantes.isEmpty()) {
                        System.out.println("No hay estudiantes registrados.");
                    } else {
                        for (Estudiante e : listaEstudiantes) {
                            e.mostrarInformacion();
                        }
                    }

                    System.out.println("\n--- LISTA DE INSTRUCTORES ---");
                    if (listaInstructores.isEmpty()) {
                        System.out.println("No hay instructores registrados.");
                    } else {
                        for (Instructor i : listaInstructores) {
                            i.mostrarInformacion();
                        }
                    }
                    break;

                case 4:
                    System.out.print("\nIngrese ID a buscar: ");
                    String idBuscar = sc.nextLine();

                    boolean encontrado = false;

                    for (Estudiante e : listaEstudiantes) {
                        if (e.getIdentificacion().equals(idBuscar)) {
                            System.out.println("\n Encontrado (Estudiante)");
                            e.mostrarInformacion();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        for (Instructor i : listaInstructores) {
                            if (i.getIdentificacion().equals(idBuscar)) {
                                System.out.println("\n Encontrado (Instructor)");
                                i.mostrarInformacion();
                                encontrado = true;
                                break;
                            }
                        }
                    }

                    if (!encontrado) {
                        System.out.println(" No se encontró la persona");
                    }
                    break;

                case 5:
                    System.out.println(" Saliendo del sistema...");
                    break;

                default:
                    System.out.println(" Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}   