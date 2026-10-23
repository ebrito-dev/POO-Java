import java.util.Date;
/**
 *
 * @author Edison Brito
 */
public class Main {
    
    public static void main(String[] args) {
        Persona hombre = new Persona("Mateo", "Vintimilla", "0102938475", 
                   new Date(101, 3, 20));
        
        Persona mujer = new Persona("Valeria", "Ordóñez", "0103847561", 
                   new Date(104, 7, 5));
        
        Persona hombre2 = new Persona("Esteban", "Carpio", "0109283746", 
                   new Date(106, 11, 25));
        
        Persona mujer2 = new Persona("Daniela", "Jaramillo", "0104928371", 
                   new Date(105, 1, 15));
        

        System.out.println("Su nombre es " + hombre.nombre
                + " Su apellido es " + hombre.apellido + " C.I: "
                + hombre2.numeroDeCedula + " nacio el " + hombre2.fechaNac);
        
        System.out.println("Su nombre es " + hombre2.nombre
                + " Su apellido es " + hombre2.apellido + " C.I: "
                + hombre.numeroDeCedula + " nacio el " + hombre.fechaNac);
        
        System.out.println("Su nombre es " + mujer.nombre
                + " Su apellido es " + mujer.apellido + " C.I: "
                + mujer.numeroDeCedula + " nacio el " + mujer.fechaNac);
        
        System.out.println("Su nombre es " + mujer2.nombre
                + " Su apellido es " + mujer2.apellido + " C.I: "
                + mujer2.numeroDeCedula + " nacio el " + mujer2.fechaNac);
    }
}