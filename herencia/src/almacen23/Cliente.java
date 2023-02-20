package almacen23;

public class Cliente extends Persona {
    private int clienteId;

    public int getClienteId() {
        return clienteId;
    }

    public Cliente(String nombre, String apellido, String direccion, int clienteId) {
        super(nombre, apellido, direccion);
        this.clienteId = clienteId;
    }

    @Override
    public String toString() {
        return "Cliente{" +"nombre='" + getNombre() +
                ", apellido='" + getApellido()  +
                ", direccion='" + getDireccion()  +
                ", clienteId=" + clienteId +
                '}';
    }
}
