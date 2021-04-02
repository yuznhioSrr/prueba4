
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
public class RestaTest extends Calificador{

    protected Operacion o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Operacion();
        rdm = new Random();
    }

  
    @Test
    public void restaInversoTest(){
        int a;
        startTest("Inverso", "a - a = 0",1.0);
        a = rdm.nextInt() / 2;
        assertEquals(o.resta(a, a), 0);
        addUp(1.0);
        passed();
    }

   
    @Test
    public void restaIdentidadTest(){
        int a;
        int b = -1;
        startTest("Identidad", "- (-(a)) = a",1.0);
        a = rdm.nextInt() / 2;
        assertEquals(o.resta(0, o.resta(0, a)), a);
        addUp(1.0);
        passed();
    }

   
}
