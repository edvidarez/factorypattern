package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Edmundo on 04/10/2016.
 */
public class PozolilloMixtoTest {
    Pozole pozole;

    @Before
    public  void setUp() throws Exception {
        pozole = new PozolilloMixto();

    }
    @Test
    public void getName() {
        assertEquals("Pozolillo mixto", pozole.getName());
    }
}
