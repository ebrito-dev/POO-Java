import java.util.Date;
/**
 *
 * @author Edison Brito
 */

public class ClasePersona {

    //Atributos 
    public String numeroDeCedula;
    public String nombre;
    public String apellido;
    private Date fechaNac;
    private float estatura;
    private double peso;
    private int numero2;

    //Metodos
    public ClasePersona() {

    }

    public ClasePersona(String nombre, String apellido, String numeroDeCedula,
            Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCedula = numeroDeCedula;
        this.fechaNac = fechaNac; 

    }
    
    public ClasePersona(String numeroDeCedula){
        this.numeroDeCedula = numeroDeCedula;
    }
    
    public ClasePersona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
    
