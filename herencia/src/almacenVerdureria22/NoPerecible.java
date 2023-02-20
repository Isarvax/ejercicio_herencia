package almacenVerdureria22;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;

    @Override
    public String toString() {
        return "NoPerecible{" +
                "nombre='" + getNombre()  +
                ", precio=" + getPrecio() +
                ", contenido=" + contenido +
                ", calorias=" + calorias +
                '}';
    }

    public NoPerecible(String nombre, Double precio, int contenido, int calorias) {
        super(nombre, precio);
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
