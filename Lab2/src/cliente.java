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
        if (o instanceof cliente) {
            cliente otro = (cliente) o;
            return documento.equals(otro.documento);
        }
        return false;
    }
  @Override
public int hashCode() {
    return Objects.hash(documento);
}
}
