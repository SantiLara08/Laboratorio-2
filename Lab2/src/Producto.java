import java.util.Objects;

public abstract class Producto implements Comparable<Producto>{
    private String id_producto;
    private String nombre;

    public Producto(String nombre, String id_producto){
        this.nombre = nombre;
        this.id_producto = id_producto;
    }

    public abstract double getPrecio();

    public String getId(){
        return id_producto;
    }

    public String getNombre(){
        return nombre;
    }

    @Override
    public int compareTo(Producto otro_producto){
        return nombre.compareTo(otro_producto.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Producto producto)) return false;
        return id_producto.equals(producto.id_producto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id_producto);
    }
}
