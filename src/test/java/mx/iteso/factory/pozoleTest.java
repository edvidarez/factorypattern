package mx.iteso.factory;

import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleRojoPierna;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 06/10/2016.
 */
public class pozoleTest {
    Pozole pozole;

    @Before
    public  void setUp() throws Exception {
        pozole = new PozoleRojoPierna();

    }
    @Test
    public void serveTest() {
       assertEquals("Serving in regular pozole plate...",pozole.serve());
    }
    @Test
    public void prepareTest(){
        assertEquals("Preparing Pozole Rojo con PiernaAdding corn kernels...Adding broth...    Oregano    Col    Rabanos",pozole.prepare());
    }
}
