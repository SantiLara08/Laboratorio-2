import java.util.Comparator;
 
public class ComparadorMejoresRepartidores implements Comparator<Repartidor> {
 
    public int compare(Repartidor a, Repartidor b) {
        int resultado = Double.compare(b.getCalificacion(), a.getCalificacion());
 
        if (resultado != 0) {
            return resultado;
        }
 
        return Integer.compare(b.getEntregas(), a.getEntregas());
    }
}
