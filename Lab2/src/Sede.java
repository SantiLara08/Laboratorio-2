import java.util.Objects;

public class Sede {
    private String id;
    private String nombre;
    private String direccion;

    public Sede(String id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    //Getters
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return nombre + " " + direccion;
    }
    

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sede sede)) return false;
        return Objects.equals(id, sede.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}