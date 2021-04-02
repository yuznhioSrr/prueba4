package icc.identidad;

/**
 * 
 * @author yuznhio
 */
public class Identidad {

    /**
    *Simula la emision de la curp
    Los parámetros de este método son:
    ap (apellido paterno), am (apellido materno),
    n (nombre), a (año), m (mes), d (día) y 
    finalmente x (sexo).
    Regresa la simulación de la curp y convierte las letras a mayúsculas.
    */
    public String curp(String ap, String am, String n, int a, int m, int d, String x){
        StringBuilder datos = new StringBuilder();
        datos.append (ap.charAt(0));
        datos.append (ap.charAt(1));
        datos.append (am.charAt(0));
        datos.append (n.charAt(0));
        datos.append (a);
        datos.append (m);
        datos.append (d);
        datos.append (x.charAt(0));
        return datos.toString().toUpperCase();
    }
}
     
