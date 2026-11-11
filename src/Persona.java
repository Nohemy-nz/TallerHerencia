public class Persona{
    private String nombre;
    private String cedula;
    private int edad

    public Persona(){

    }

    public Persona(String nombre, String cedula, int edad){
        this.nombre = nombre;
        this.cedula = cedula; 
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
    }

    public void setEdad(int edad){
        if(edad >=  0){
            this.edad = edad;
        }else{
            System.out.println("La edad no puede ser negativa"),
        }
    }

    public String getNombre(){
        return nombre;
    }

    public String getCedula(){
        return cedula;
    }

    public int getEdad(){
        return edad;
    }

    public String saludar(){
        return System.out.println("Hola, me llamo" + nombre + " y tengo" +  edad " años.");

    }

    public void mostrarInfo(){
        system.out.println("Nombre: " + nombre);
        system.out.println("Cedula: " + cedula);
        System.out.println("Edad: " + edad);
    }
}