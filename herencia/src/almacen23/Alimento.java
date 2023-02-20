package almacen23;

public class Alimento extends Producto {
    private String description;



    public String getDescription() {
        return description;
    }

    public Alimento(String nombre, Double precio, String description) {
        super(nombre, precio);
        this.description = description;
    }

    @Override
    public String toString() {
        return "Alimento{" +
                "nombre='" + getNombre()  +
                ", precio=" + getPrecio() +  ", description=" + description + '}';
    }
}
