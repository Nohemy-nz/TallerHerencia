public class App {
    public static void main(String[] args) {

        Persona p1 = new Persona("Camila", "1010203764", 16);

        Estudiante e1 = new Estudiante("Thiago", "987654321", 18, "EST001", 4.5);

        Profesor pr1 = new Profesor( "Andres", "456789123", 45, "Sistemas", 3500000);

        System.out.println("Persona");
        p1.mostrarInfo();

        System.out.println("\nEstudiante");
        e1.mostrarInfo();
        System.out.println("\nProfesor");
        pr1.mostrarInfo();
        
        System.out.println();
        p1.saludar();
        e1.saludar();
        pr1.saludar();

        System.out.println();
        Persona [] personas = new Persona[3];
        personas[0] = p1;
        personas[1] = e1;
        personas[2] = pr1;

        for (Persona persona : personas) {
            persona.mostrarInfo();
            System.out.println();
        }

    }
}
