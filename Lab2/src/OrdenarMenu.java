import java.util.Comparator;
 
public class OrdenarMenu implements Comparator<Producto> {
 
    public int compare(Producto producto1, Producto producto2) {
        int comparacionPrecio = Double.compare(producto2.getPrecio(), producto1.getPrecio());
 
        if (comparacionPrecio != 0) {
            return comparacionPrecio;
        }
 
        return producto1.getNombre().compareTo(producto2.getNombre());
    }
}
