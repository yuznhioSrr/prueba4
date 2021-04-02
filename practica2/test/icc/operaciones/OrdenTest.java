
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
public class OrdenTest extends Calificador{

    protected Orden o;
    protected Random rdm;

    @Override
    public void init(){
        o = new Orden();
        rdm = new Random();
    }

    @Test
    public void tricotomiaTest(){
        int a, b;
        boolean p, q, r;
        startTest("Tricotomia", "int a,b : o.igual(a, b) || o.mayor(a, b) || o.menor(a, b)",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        p = o.igual(a, b);
        q = o.mayor(a, b);
        r = o.menor(a, b);
        assertTrue(p || q || r);
        addUp(1.0);
        passed();
    }

    @Test
    public void MdicotomiaTest(){
        int a, b;
        boolean q, r;
        startTest("Dicotomia", "int a,b : o.mayor(a, b) || o.menorIgual(a, b)",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        q = o.mayor(a, b);
        r = o.menorIgual(a, b);
        assertTrue(q || r);
        addUp(1.0);
        passed();
    }

    @Test
    public void mdicotomiaTest(){
        int a, b;
        boolean q, r;
        startTest("Dicotomia", "int a,b : o.mayorIgual(a, b) || o.menor(a, b)",1.0);
        a = rdm.nextInt() / 2;
        b = rdm.nextInt() / 2;
        q = o.mayorIgual(a, b);
        r = o.menor(a, b);
        assertTrue(q || r);
        addUp(1.0);
        passed();
    }
}
