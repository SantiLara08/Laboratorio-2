import java.util.ArrayList;

public class Combo extends Producto{
    private double descuento;
    private ArrayList<Producto> productos;

    public Combo(String nombre, double descuento, int id_producto){
        super(nombre, id_producto);
        this.descuento = descuento;
        this.productos = new ArrayList<>();
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public double getDescuento(){
        return descuento;
    }

    @Override
    public double getPrecio(){
        double suma = Calculos.calcularTotal(productos);
        return suma - suma * descuento / 100;
    }

    @Override
    public String toString() {
        return "Combo{" +
                "descuento=" + descuento +
                ", productos=" + productos +
                '}';
    }
}
