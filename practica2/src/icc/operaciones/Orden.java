package icc.operaciones;

/**
 * 
 * @author yuznhio
 */
public class Orden {

    /**
    * Simula la operacion mayor que.
    * @param a Primer Operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean mayor(int a, int b){
        return a > b;
    }

    /**
    * Simula la operacion menor que.
    * @param a Primer operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean menor(int a, int b){
        return a < b;
    }

    /**
    * Simula la operacion igual.
    * @param a Primer operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean igual(int a, int b){
        return a == b;
    }

    /**
    * Simula la operacion mayor o igual.
    * @param a Primer operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean mayorIgual(int a, int b){
        return a >= b;
    }
    /**
    * Simula la operacion menor o igual.
    * @param a Primer operando.
    * @param b Segundo operando.
    * @return Resultado.
    */
    public boolean menorIgual(int a, int b){
        return a <= b;
    }
  

}

