import java.util.Date;

/**
 *
 * @author Edison Brito
 */
public class Persona {

    //Atributos
    public String nombre;
    public String apellido;
    public byte edad;
    public Date fechaNac;
    public String numeroDeCedula;

    // Metodos
    //Constructor
    public Persona() {
        
    }

    public Persona(String nombre, String apellido, String numeroDeCedula, 
            Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeCedula= numeroDeCedula;
        this.fechaNac = fechaNac;
        
    }

    public Persona(String nombre, String apellido) {
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public Persona(byte edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println("La persona comio");
    }

    public void caminar() {
        System.out.println("La persona camino");
    }

    public void correr() {
        System.out.println("La persona corrio");
    }

    public void dormir(String nombre) {
        System.out.println(nombre + " esta durmiendo");
    }
}
