package empresasempleados;

import java.util.ArrayList;

public class Empresa {

    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String razonSocial,int cuit){
        this.razonSocial=razonSocial;
        this.cuit=cuit;
        this.empleados= new ArrayList<Empleado>();
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    
     public void agregarEmpleado(Empleado emp){
        this.empleados.add(emp);
    }
    
    public void mostrarEmpleados(){
        for(Empleado elem: empleados){
            System.out.println(elem);
        }
    }
     
}
