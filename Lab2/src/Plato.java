public class Plato extends Producto{
    private double precio;
    private int tiempo_preparacion_mins;

    public Plato(double precio, String nombre, int tiempo_preparacion_mins, String id_producto){
        super(nombre, id_producto);
        this.precio = precio;
        this.tiempo_preparacion_mins = tiempo_preparacion_mins;
    }

    @Override
    public double getPrecio(){
        return precio;
    }

    public int getTiempoPreparacion(){
        return tiempo_preparacion_mins;
    }

    @Override
    public String toString() {
        return "Plato{" +
                "precio=" + precio +
                ", tiempo_preparacion_mins=" + tiempo_preparacion_mins +
                '}';
    }
}
