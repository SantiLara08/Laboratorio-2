import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class Registro<K, T> {
    private HashMap<K, T> guardados;
    private Function<T, K> obtener_id;

    public Registro(Function<T, K> obtener_id){
        this.guardados = new HashMap<>();
        this.obtener_id = obtener_id;
    }

    public boolean guardar(T elemento){
        K llave = obtener_id.apply(elemento);
        if(guardados.containsKey(llave)){
            return false;
        }
        else{
            guardados.put(llave, elemento);
            return true;
        }
    }

    public Optional<T> buscar(K llave){
        if(guardados.containsKey(llave)){
            return Optional.of(guardados.get(llave));
        }
        else{
            return Optional.empty();
        }
    }

    public List<T> getTodos(){
        return new ArrayList<>(guardados.values());
    }
}
