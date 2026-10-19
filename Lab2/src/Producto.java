import java.util.Objects;

public abstract class Producto {
    private int id_producto;
    private String nombre;

    public Producto(String nombre, int id_producto){
        this.nombre = nombre;
        this.id_producto = id_producto;
    }

    public abstract double getPrecio();

    public int getId(){
        return id_producto;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return id_producto == producto.id_producto;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_producto);
    }
}
