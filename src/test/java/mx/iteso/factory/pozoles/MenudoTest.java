package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.pozoles.Menudo;
import mx.iteso.factory.pozoles.PozoleBlancoCachete;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 04/10/2016.
 */
public class MenudoTest {
    Pozole pozole;

    @Before
    public  void setUp() throws Exception {
        pozole = new Menudo();

    }
    @Test
    public void getName() {
        assertEquals("Menudo", pozole.getName());
    }
    @Test
    public void getServe(){
        assertEquals("Serving xtra hot in special menudo plate...",pozole.serve());
    }
}

