public class Repartidor implements Comparable<Repartidor>{
    private String  id_repartidor;
    private String nombre;
    private String telefono;
     private double calificacion;  
    private int entregas;  

    public Repartidor(String id_repartidor,String nombre,String telefono){
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
    public double getCalificacion() {
        return calificacion;
    }


    public int getEntregas() {
        return entregas;
    }

    public void registrarEntrega(double nota) {
        calificacion = (calificacion * entregas + nota) / (entregas + 1);
        entregas = entregas + 1;
    }
    public boolean equals(Object o) {
        if (o instanceof Repartidor) {
            Repartidor otro = (Repartidor) o;
            return id_repartidor.equals(otro.id_repartidor);
        }
        return false;
    }
       public int hashCode() {
        return id_repartidor.hashCode();
    }

    @Override
    public int compareTo(Repartidor otro_repartidor){
        return nombre.compareTo(otro_repartidor.nombre);
    }
}
