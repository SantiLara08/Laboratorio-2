import java.util.List;

public class Combo extends Producto{
    private double descuento;
    private List<Producto> productos;

    public Combo(double precio, String nombre, double descuento){
        super(precio,nombre);
        this.descuento = descuento;
    }
}
