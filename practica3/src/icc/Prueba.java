
package icc;
import java.util.Scanner; 
import icc.identidad.Identidad;

/**
 * 
 * @author yuznhio
 */
public class Prueba {

    public static void main(String[] s){
    
    int a, m, d;
    String paterno, materno, nombre, sex;
    Scanner entrada1 = new Scanner (System.in);
    Scanner entrada2 = new Scanner (System.in);
    Identidad INE = new Identidad();
      
    System.out.println ("Ingrese su nombre");
    nombre = entrada1.nextLine();
    nombre = nombre.toUpperCase();

    System.out.println ("Ingrese su apellido paterno");
    paterno = entrada1.nextLine();
    paterno = paterno.toUpperCase();
    
    System.out.println ("Ingrese su apellido materno");
    materno = entrada1.nextLine();
    materno = materno.toUpperCase();   

    System.out.println ("¿Es usted hombre o mujer?");
    sex = entrada1.nextLine();
    sex = sex.toUpperCase();

           
    System.out.println ("Ingrese su año de nacimiento: ");
    a = entrada2.nextInt();
    a = a % 100;

    System.out.println ("Ingrese su mes de nacimiento (Formato MM): ");
    m = entrada2.nextInt();

    System.out.println ("Ingrese su Dia de nacimiento (Formato DD): ");
    d = entrada2.nextInt();
   

    System.out.println ("Nombre: " + nombre + " " + paterno + " " + materno);
    System.out.println ("Fecha de nacimiento: " + d + "/" + m + "/" + a);
    System.out.println ("Sexo: " + sex);
    System.out.println("Curp: " + INE.curp(paterno, materno, nombre, a, m, d, sex));

    }

}
