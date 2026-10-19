import java.util.List;

public class Calculos {
    private Calculos(){}

    public static double calcularTotal(List<? extends Producto> productos){
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }
}
