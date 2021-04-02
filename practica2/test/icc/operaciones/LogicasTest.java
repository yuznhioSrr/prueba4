
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
 * @author mindahrelfen
 */
public class LogicasTest extends Calificador{

    protected Logico o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Logico();
        rdm = new Random();
    }

    @Test
    public void andConmutativaTest(){
        boolean a, b;
        startTest("AndConmutatividad", "a && b = b && a",1.0);
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.and(a,b), o.and(b,a));
        addUp(1.0);
        passed();
    }

    @Test
    public void orConmutativaTest(){
        boolean a, b;
        startTest("OrConmutatividad", "a || b = b || a",1.0);
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.or(a,b), o.or(b,a));
        addUp(1.0);
        passed();
    }

    @Test
    public void xorConmutativaTest(){
        boolean a, b;
        startTest("XorConmutatividad", "a ^ b = b ^ a",1.0);
        a = rdm.nextInt() > rdm.nextInt();
        b = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.xor(a,b), o.xor(b,a));
        addUp(1.0);
        passed();
    }

    @Test
    public void identidadTest(){
        boolean a;
        startTest("Identidad", "!!a = a",1.0);
        a = rdm.nextInt() > rdm.nextInt();
        assertEquals(o.not(o.not(a)),a);
        addUp(1.0);
        passed();
    }
}
