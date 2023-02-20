package almacen23;

public class NoPecedero extends Alimento{
    private int contenido;
    private int calorias;

    @Override
    public String toString() {
        return "NoPerecible{" +
                "nombre='" + getNombre()  +
                ", precio=" + getPrecio() +
                ", descripcion='" + getDescription() +
                ", contenido=" + contenido +
                ", calorias=" + calorias +
                '}';
    }

    public NoPecedero(String nombre, Double precio, String description, int contenido, int calorias) {
        super(nombre, precio, description);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
}
