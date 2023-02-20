package companyPeople21;

public class Gerente extends Empleado{
    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empreadoId, Double presupuesto) {

        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empreadoId);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nombre='" + getNombre() + " , " +
                ", apellido='" + getApellido() + " , " +
                ", numeroFiscal='" + getNumeroFiscal() + " , " +
                ", direccion='" + getDireccion() + " , " +
                " remuneracion=" + getRemuneracion() +
                ", empreadoId=" + getEmpreadoId() +
                "  presupuesto=" + presupuesto +
                '}';
    }
}
