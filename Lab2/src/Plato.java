public class Plato extends Producto{
    private int tiempo_preparacion_mins;

    public Plato(double precio, String nombre, int tiempo_preparacion_mins){
        super(precio,nombre);
        this.tiempo_preparacion_mins = tiempo_preparacion_mins;
    }
}
