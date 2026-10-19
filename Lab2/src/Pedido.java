import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private String id;
    private Cliente cliente;
    private Sede sede;
    private List<Producto> productos;

    public Pedido(String id, Cliente cliente, Sede sede) {
        this.id = id;
        this.cliente = cliente;
        this.sede = sede;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    //Getters
    public String getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public String getNombreSede() {
        return this.sede.getNombre();
    }
    public Sede getSede() {
        return sede;
    }
    public List<Producto> getProductos() {
        return productos;
    }

    //Funcion getTotal
    public double getTotal() {
        double total = 0;
        for (Producto prod : productos) {
            total += prod.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido " + id + " de " + cliente.getNombre() + " en " + getSede() + " - Total: " + getTotal();
    }
}

