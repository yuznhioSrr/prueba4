
package icc.operaciones;

import java.util.NoSuchElementException;
import java.util.Random;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import icc.*;


/**
 *
 * @author yuznhio
 */
public class MultiplicaTest extends Calificador{

    protected Operacion o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Operacion();
        rdm = new Random();
    }

    @Test
    public void multiplicaConmutativaTest(){
        int a, b;
        startTest("Conmutatividad", "a * b = b * a",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        assertEquals(o.multiplicacion(a,b), o.multiplicacion(b,a));
        addUp(1.0);
        passed();
    }
    
    @Test
    public void multiplicaAsociativaTest(){
        int a, b, c;
        startTest("Asociatividad", "(a * b) * c = a * (b * c)",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        c = rdm.nextInt() / 2;
        assertEquals(o.multiplicacion(o.multiplicacion(a,b),c), o.multiplicacion(o.multiplicacion(b,c),a));
        addUp(1.0);
        passed();
    }

    @Test
    public void multiplicaNeutroTest(){
        int a;
        startTest("Neutro", "a * 1 = 1",1.0);
        a = rdm.nextInt() / 2;
        assertEquals(o.multiplicacion(a,1), a);
        addUp(1.0);
        passed();
    }

    @Test
    public void distributividadTest(){
        int a, b, c, d, e;
        startTest("Distributividad", "a * (b + c) = a * b + a * c",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        c = rdm.nextInt() / 2;
	d = o.multiplicacion(a, o.suma(b,c));
	e = o.suma(o.multiplicacion(a,b), o.multiplicacion(a,c));
        assertEquals(d, e);
        addUp(1.0);
        passed();
    }  
}
