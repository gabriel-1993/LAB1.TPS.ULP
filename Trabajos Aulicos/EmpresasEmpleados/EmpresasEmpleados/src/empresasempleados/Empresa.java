package empresasempleados;

import java.util.ArrayList;
import java.util.Objects;

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
    
    //este metodo se ejecuta desde empleado al crear uno nuevo
     public void agregarEmpleado(Empleado emp){
        this.empleados.add(emp);
    }
    
    public void mostrarEmpleados(){
        for(Empleado elem: empleados){
            System.out.println(elem);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (!Objects.equals(this.razonSocial, other.razonSocial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  razonSocial  ;
    }
     
}
