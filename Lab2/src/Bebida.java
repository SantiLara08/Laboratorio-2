public class Bebida extends Producto{
    private int tamano_mililitros;

    public Bebida(float precio, String nombre, int tamano_mililitros){
        super(precio,nombre);
        this.tamano_mililitros = tamano_mililitros;
    }
}
