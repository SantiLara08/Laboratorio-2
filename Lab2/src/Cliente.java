import java.util.Objects;
public class Cliente{
   private String documento;
   private String nombre;
   private String correo;
   private String telefono;

   public Cliente(String documento,String nombre,String correo,String telefono){
       this.documento=documento;
       this.nombre=nombre;
       this.correo=correo;
       this.telefono=telefono;
   }
   public String getDocumento() {
        return documento;
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    public boolean equals(Object o) {
        if (o instanceof Cliente) {
            Cliente otro = (Cliente) o;
            return documento.equals(otro.documento);
        }
        return false;
    }
  @Override
public int hashCode() {
    return Objects.hash(documento);
}
}
