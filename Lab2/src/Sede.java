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
}