import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private String id;
    private Cliente cliente;
    private Sede sede;
    private List<Producto> productos;
    private EstadoPedido estado;
    private Canal canal;

    public Pedido(String id, Cliente cliente, Sede sede, EstadoPedido estado, Canal canal) {
        this.id = id;
        this.cliente = cliente;
        this.sede = sede;
        this.productos = new ArrayList<>();
        this.estado = estado;
        this.canal = canal;
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
    public EstadoPedido getEstado() {
        return estado;
    }
    public Canal getCanal() {
        return canal;
    }

    //Funcion getTotal
    public double getTotal() {
        double total = 0;
        for (Producto prod : productos) {
            total += prod.getPrecio();
        }
        return total;
    }

    //Setters
    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }
    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return "Pedido " + id + " de " + cliente.getNombre() + " en " + getSede() + " - Total: " + getTotal();
    }
}

