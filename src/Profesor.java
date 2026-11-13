public class Profesor extends Persona {
    private String departamento;
    private double salario;

    public Profesor(){
        
    }

    public Profesor(String nombre, String cedula, int edad, String departamento, double salario){
        super(nombre, cedula, edad);
        this.departamento = departamento;
        this.salario = salario;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getDepartamento(){
        return departamento;
    }

    public double getSalario(){
        return salario;
    }

    public void diclarClase(){
        System.out.println(getNombre() + "esta dictando clase en el departamento de" + departamento);
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Cedula: " + getCedula());
        System.out.println("Edad: " + getEdad());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + salario);

    }
}