package empresasempleados;

/**
 *
 * @author Gabriel
 */
public class Empleado {
    
    private int dni;
    
    private String nombre;
    
    private String apellido;
    
    private String categoria;
    
    private double sueldo;

    private Empresa empresa;
   
    public Empleado(int dni, String nombre,String apellido,String categoria,double sueldo,Empresa empresa){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.categoria=categoria;
        this.sueldo=sueldo;
        this.empresa=empresa;
    }
    //setter para asignar empresa al instanciar empleado
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

   
    
   
}
