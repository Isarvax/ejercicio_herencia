package almacen23;

public class Perecedero extends Alimento{
    private int proteinas;

    @Override
    public String toString() {
        return "Lacteo{" +
                "nombre='" + getNombre()  +
                ", precio=" + getPrecio() +
                ", descripcion='" + getDescription() +
                ", proteinas=" + proteinas +
                '}';
    }



    public int getProteinas() {
        return proteinas;
    }

    public Perecedero(String nombre, Double precio, String description, int proteinas) {
        super(nombre, precio, description);
        this.proteinas = proteinas;
    }
}
