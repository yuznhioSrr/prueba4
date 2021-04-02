package icc.operaciones;

/**
 * 
 * @author yuznhio
 */
public class Logico {

    /**
    * Simula la negacion proposicional.
    * @param a Operando de la negación.
    * @return Resultado de la negación.
    */
    public boolean not(boolean a){
        return !a;
    }

    /**
    * Simula la conjuncion proposicional.
    * @param a Primer operando de la conjuncion.
    * @param b Segundo operando de la conjuncion.
    * @return Resultado de la conjuncion.
    */
    public boolean and(boolean a, boolean b){
        return a && b;
    }

    /**
    * Simula la disyuncion proposicional.
    * @param a Primer operando de la disyuncion.
    * @param b Segundo operando de la disyuncion.
    * @return Resultado de la disyuncion.
    */
    public boolean or(boolean a, boolean b){
        return a || b;
    }

    /**
    * Simula xor.
    * @param a Primer operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean xor(boolean a, boolean b){
        return a ^ b;
    }
}

