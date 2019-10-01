import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class GestionAl {
    public static void main(String[] args) {
        Hashtable<String, Alumno> gestionAl = new Hashtable();
        int opcion;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("*******************");
            System.out.println("--  MENÚ ALUMNOS --");
            System.out.println("*******************");
            System.out.println("1. Agregar alumno");
            System.out.println("2. Buscar alumno ");
            System.out.println("3. Borrar alumno");
            System.out.println("4. Listar alumnos");
            System.out.println("5. Listar dnis");
            System.out.println("6. Salir");
            System.out.println("*******************");
            System.out.println("¿¿Qué deseas hacer??");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    String nombre,apellidos,dni;
                    int matricula;
                    System.out.println("** OPCIÓN [Agregar Alumno] **");
                    System.out.println("Intruduce el NOMBRE: ");
                    nombre = sc.next();
                    sc.nextLine();
                    System.out.println("Intruduce APELLIDOS: ");
                    apellidos = sc.next();
                    sc.nextLine();
                    System.out.println("Intruduce el DNI: ");
                    dni = sc.next();
                    sc.nextLine();
                    System.out.println("Intruduce la MATRÍCULA: ");
                    matricula = sc.nextInt();
                    sc.nextLine();
                    Alumno alumno = new Alumno(nombre,apellidos,dni,matricula);
                    if(gestionAl.containsKey(dni)){
                        System.out.println("No se puede introducir al alumno");
                    }else{gestionAl.put(alumno.getDni(),alumno);}
                    break;

                case 2:
                    System.out.println("** OPCIÓN [Buscar Alumno] **");
                    System.out.println("Introduce la clave del alumno(dni): ");
                    dni = sc.next();
                    sc.nextLine();
                    if(gestionAl.containsKey(dni)) {
                        Alumno aEncontrado = gestionAl.get(dni);
                        System.out.printf("DNI(%s): %s %s \n",  aEncontrado.getDni(), aEncontrado.getNombre(), aEncontrado.getApellidos());
                    } else System.out.println("El alumno no ha sido encontrado!");
                    break;

                case 3:
                    System.out.println("** OPCIÓN [Borrar Alumno] **");
                    System.out.println("Introduce el DNI: ");
                    dni = sc.next();
                    System.out.println(dni);
                    sc.nextLine();
                    gestionAl.remove(dni);
                    break;

                case 4:
                    System.out.println("** OPCIÓN [Listar Alumnos] **");
                    Enumeration<Alumno> todos = gestionAl.elements();
                    while (todos.hasMoreElements()){
                        Alumno proximo = todos.nextElement();
                        System.out.printf("- %s %s. dni: %s Nº de matricula: %d \n",proximo.getNombre(),proximo.getApellidos(),proximo.getDni(),proximo.getMatricula());
                    }
                    break;

                case 5:
                    System.out.println("** OPCIÓN [Listar Dnis] **");
                    Enumeration<String> claves = gestionAl.keys();
                    while (claves.hasMoreElements()){
                        String proximo = claves.nextElement();
                        System.out.printf("- %s \n",proximo);}
                    break;

                case 6:
                    System.out.println("SALIENDO... :(");
                    break;

                default:
                    System.out.println("¡¡¡Introduce los datos correctos!!!");
                    break;
            }
        } while (opcion != 6);
    }
}
