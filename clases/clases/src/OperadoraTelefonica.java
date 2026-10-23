

/**
 *
 * @author Edison Brito
 */
public class OperadoraTelefonica {
    
    private int codigo; 
    private String nombre;
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Operadoda Telefonica: Codigo " + codigo + " Nombre: ";
    }
}

