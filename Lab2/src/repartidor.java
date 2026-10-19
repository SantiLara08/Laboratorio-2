public class repartidor{
    private String  id_repartidor;
    private String nombre;
    private String telefono;

    public repartidor(String id_repartidor,String nombre,String telefono){
        this.id_repartidor=id_repartidor;
        this.nombre=nombre;
        this.telefono=telefono;
    }
  public String getId_repartidor() {
        return id_repartidor;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getTelefono() {
        return telefono;
    }
     public int hashCode() {
        return id_repartidor.hashCode();
    }
     public boolean equals(Object o) {
        if (o instanceof repartidor) {
            repartidor otro = (repartidor) o;
            return id_repartidor.equals(otro.id_repartidor);
        }
        return false;
    }
       public int hashCode() {
        return id_repartidor.hashCode();
    }
}
