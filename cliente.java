import java.util.Objects;
public class cliente{
   private String documento;
   private String nombre;
   private String correo;
   private String telefono;

   public cliente(String documento,String nombre,String correo,String telefono){
       this.documento=documento;
       this.nombre=nombre;
       this.correo=correo;
       this.telefono=telefono;
   }
  @Override
public int hashCode() {
    return Objects.hash(documento);
}
}
