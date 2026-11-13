public class Estudiante extends Persona {
    private  String codigoEstudiantil;
    private double promedio;

    public Estudiante(){

    }

    public Estudiante(String nombre, String cedula, int edad, String codigoEstudiantil, double promedio){
        super(nombre, cedula, edad);
        this.codigoEstudiantil = codigoEstudiantil;
        this.promedio = promedio;

    }

    public void setCodigoEstudiantil(String codigoEstudiantil){
        this.codigoEstudiantil = codigoEstudiantil;
    }

    public String getCodigoEstudiantil(){
        return codigoEstudiantil;
    }

    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    public double getPromedio(){
        return promedio;
    }

    public void estudiar(){
        System.out.println(getNombre() + " esta estudiando");

    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Codigo del Estudiante:" + codigoEstudiantil);
        System.out.println("Promedio: " + promedio);

    }
}