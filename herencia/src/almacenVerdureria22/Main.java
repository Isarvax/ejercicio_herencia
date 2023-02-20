package almacenVerdureria22;

public class Main {
    public static void main(String[] args) {
        Producto productos[]=new Producto[8];
        productos[0]=new Fruta("Manzana",800.0,50.0,"Rojo");
        productos[1]=new Fruta("Pera",1000.0,50.0,"Verde");
        productos[2]=new Lacteo("Leche",2000.0,2,90);
        productos[3]=new Lacteo("Queso",4000.0,6,100);
        productos[4]=new Limpieza("Detergente",10000.0,"Cloro y colorante",2.2);
        productos[5]=new Limpieza("Jabon Liquido",5000.0,"Canela y limon",0.7);
        productos[6]=new NoPerecible("Aceite",6000.0,5,600);
        productos[7]=new NoPerecible("Sopa la sopera",8000.0,6,500);
        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
