package almacen23;

public class Vendedor extends Persona {
    private Double salario;
    private int empreadoId;

    public Double getSalario() {
        return salario;
    }

    public int getEmpreadoId() {
        return empreadoId;
    }

    public Vendedor(String nombre, String apellido, String direccion, Double salario, int empreadoId) {
        super(nombre, apellido, direccion);
        this.salario = salario;
        this.empreadoId = empreadoId;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "nombre='" + getNombre() +
                ", apellido='" + getApellido()  +
                ", direccion='" + getDireccion()  +
                ", salario=" + salario +
                ", empreadoId=" + empreadoId +
                '}';
    }
}
