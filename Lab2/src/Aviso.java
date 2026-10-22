public class Aviso implements Interesado {
    private String nombre_interesado;

    public Aviso(String nombre_interesado){
        this.nombre_interesado = nombre_interesado;
    }

    @Override
    public void avisar(Pedido pedido){
        System.out.println(nombre_interesado + ": el pedido " + pedido.getId() + " ahora esta " + pedido.getEstado());
    }
}
