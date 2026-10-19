public class Bebida extends Producto{
    private double precio;
    private int tamano_mililitros;

    public Bebida(double precio, String nombre, int tamano_mililitros, String id_producto){
        super(nombre, id_producto);
        this.precio = precio;
        this.tamano_mililitros = tamano_mililitros;
    }

    @Override
    public double getPrecio(){
        return precio;
    }

    public int getTamano(){
        return tamano_mililitros;
    }

    @Override
    public String toString() {
        return "Bebida{" +
                "precio=" + precio +
                ", tamano_mililitros=" + tamano_mililitros +
                '}';
    }
}
