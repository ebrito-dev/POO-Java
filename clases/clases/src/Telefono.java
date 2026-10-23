/**
 *
 * @author Edison Brito
 */
public class Telefono {
    
    //Atributos
    public String numero;
    public String operadora;
    
    private int numero2;
    private String tipo;          
    //Atributos de las relaciones
    private Persona unaPersona;
    private OperadoraTelefonica unaOperadora;
    
    public int getNumero(){
        return numero2;  
    }
    
    public void setNumero(int numero2){
        this.numero2 = numero2;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public Persona getunaPersona(){
        return unaPersona;
    }
    
    public void setunaPersona(Persona unaPersona){
        this.unaPersona = unaPersona;
    }
    
    public OperadoraTelefonica getunaOperadora(){
        return unaOperadora;
    }
    
    public void setunaOperadora(OperadoraTelefonica unaOperadora){
        this.unaOperadora = unaOperadora;
    }
    
    //Constructores
    public Telefono(){
        
    }
    
    public Telefono(String numero, String operadora){
        this.numero = numero ;
        this.operadora = operadora;
    }
      
            
            
    @Override
    public String toString(){
        return "Telefono: Numero " + numero + " Tipo: " + tipo;
                 
    }
    
    
    
    
}
