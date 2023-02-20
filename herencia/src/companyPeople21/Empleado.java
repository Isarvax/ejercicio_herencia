package companyPeople21;

public class Empleado extends Persona {
    private Double remuneracion;
    private int empreadoId;

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion+=(this.remuneracion*(porcentaje/100));
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + " , " +
                ", apellido='" + getApellido() + " , " +
                ", numeroFiscal='" + getNumeroFiscal() + " , " +
                ", direccion='" + getDireccion() + " , " +
                "remuneracion=" + remuneracion +
                ", empreadoId=" + empreadoId +
                '}';
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empreadoId) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empreadoId = empreadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpreadoId() {
        return empreadoId;
    }
}
