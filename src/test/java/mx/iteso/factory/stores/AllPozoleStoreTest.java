package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Edmundo on 04/10/2016.
 */
public class AllPozoleStoreTest {
    AllPozoleStore pozoleria;
    Pozole p;

    @Before
    public  void setUp() throws Exception {
        pozoleria = new AllPozoleStore();


    }
    @Test
    public void test1(){
        Pozole Rojopollo;
        Rojopollo = new PozoleRojoPollo();
        p = pozoleria.createPozole("Rojo","pollo");
        assertEquals(Rojopollo.getName(),p.getName());
    }
    @Test
    public void test2(){
        Pozole Rojopierna;
        Rojopierna = new PozoleRojoPierna();
        p = pozoleria.createPozole("Rojo","pierna");
        assertEquals(Rojopierna.getName(),p.getName());
    }
    @Test
    public void test3(){
        Pozole Rojocachete;
        Rojocachete = new PozoleRojoCachete();
        p = pozoleria.createPozole("Rojo","cachete");
        assertEquals(Rojocachete.getName(),p.getName());
    }
    @Test
    public void test4(){
        Pozole Rojotrompa;
        Rojotrompa = new PozoleRojoTrompa();
        p = pozoleria.createPozole("Rojo","trompa");
        assertEquals(Rojotrompa.getName(),p.getName());
    }
    @Test
    public void test5(){
        Pozole Rojooreja;
        Rojooreja = new PozoleRojoOreja();
        p = pozoleria.createPozole("Rojo","oreja");
        assertEquals(Rojooreja.getName(),p.getName());
    }
    @Test
    public void test6(){
        Pozole Rojomixto;
        Rojomixto = new PozoleRojoMixto();
        p = pozoleria.createPozole("Rojo","mixto");
        assertEquals(Rojomixto.getName(),p.getName());
    }
    @Test
    public void test7(){
        Pozole Blancopollo;
        Blancopollo = new PozoleBlancoPollo();
        p = pozoleria.createPozole("Blanco","pollo");
        assertEquals(Blancopollo.getName(),p.getName());
    }
    @Test
    public void test8(){
        Pozole Blancopierna;
        Blancopierna = new PozoleBlancoPierna();
        p = pozoleria.createPozole("Blanco","pierna");
        assertEquals(Blancopierna.getName(),p.getName());
    }
    @Test
    public void test9(){
        Pozole Blancocachete;
        Blancocachete = new PozoleBlancoCachete();
        p = pozoleria.createPozole("Blanco","cachete");
        assertEquals(Blancocachete.getName(),p.getName());
    }
    @Test
    public void test10(){
        Pozole Blancotrompa;
        Blancotrompa = new PozoleBlancoTrompa();
        p = pozoleria.createPozole("Blanco","trompa");
        assertEquals(Blancotrompa.getName(),p.getName());
    }
    @Test
    public void test11(){
        Pozole Blancooreja;
        Blancooreja = new PozoleBlancoOreja();
        p = pozoleria.createPozole("Blanco","oreja");
        assertEquals(Blancooreja.getName(),p.getName());
    }
    @Test
    public void test12(){
        Pozole Blancomixto;
        Blancomixto = new PozoleBlancoMixto();
        p = pozoleria.createPozole("Blanco","mixto");
        assertEquals(Blancomixto.getName(),p.getName());
    }

    @Test
    public void test13(){
        Pozole Verdepollo;
        Verdepollo = new PozoleVerdePollo();
        p = pozoleria.createPozole("Verde","pollo");
        assertEquals(Verdepollo.getName(),p.getName());
    }
    @Test
    public void test14(){
        Pozole Verdepierna;
        Verdepierna = new PozoleVerdePierna();
        p = pozoleria.createPozole("Verde","pierna");
        assertEquals(Verdepierna.getName(),p.getName());
    }
    @Test
    public void test15(){
        Pozole Verdecachete;
        Verdecachete = new PozoleVerdeCachete();
        p = pozoleria.createPozole("Verde","cachete");
        assertEquals(Verdecachete.getName(),p.getName());
    }
    @Test
    public void test16(){
        Pozole Verdetrompa;
        Verdetrompa = new PozoleVerdeTrompa();
        p = pozoleria.createPozole("Verde","trompa");
        assertEquals(Verdetrompa.getName(),p.getName());
    }
    @Test
    public void test17(){
        Pozole Verdeoreja;
        Verdeoreja = new PozoleVerdeOreja();
        p = pozoleria.createPozole("Verde","oreja");
        assertEquals(Verdeoreja.getName(),p.getName());
    }
    @Test
    public void test18(){
        Pozole Verdemixto;
        Verdemixto = new PozoleverdeMixto();
        p = pozoleria.createPozole("Verde","mixto");
        assertEquals(Verdemixto.getName(),p.getName());
    }
    @Test
    public void test19(){
        Pozole Pozolillopollo;
        Pozolillopollo = new PozolilloPollo();
        p = pozoleria.createPozole("Pozolillo","pollo");
        assertEquals(Pozolillopollo.getName(),p.getName());
    }
    @Test
    public void test20(){
        Pozole Pozolillopierna;
        Pozolillopierna = new PozolilloPierna();
        p = pozoleria.createPozole("Pozolillo","pierna");
        assertEquals(Pozolillopierna.getName(),p.getName());
    }
    @Test
    public void test21(){
        Pozole Pozolillocachete;
        Pozolillocachete = new PozolilloCachete();
        p = pozoleria.createPozole("Pozolillo","cachete");
        assertEquals(Pozolillocachete.getName(),p.getName());
    }
    @Test
    public void test22(){
        Pozole Pozolillotrompa;
        Pozolillotrompa = new PozolilloTrompa();
        p = pozoleria.createPozole("Pozolillo","trompa");
        assertEquals(Pozolillotrompa.getName(),p.getName());
    }
    @Test
    public void test23(){
        Pozole Pozolillooreja;
        Pozolillooreja = new PozolilloOreja();
        p = pozoleria.createPozole("Pozolillo","oreja");
        assertEquals(Pozolillooreja.getName(),p.getName());
    }
    @Test
    public void test24(){
        Pozole Pozolillomixto;
        Pozolillomixto = new PozolilloMixto();
        p = pozoleria.createPozole("Pozolillo","mixto");
        assertEquals(Pozolillomixto.getName(),p.getName());
    }
    @Test
    public void test25(){
        Pozole menudo;
        menudo = new Menudo();
        p = pozoleria.createPozole("Menudo","menudo");
        assertEquals(menudo.getName(),p.getName());
    }
    @Test(expected= java.lang.Exception.class)
    public void test26() throws Exception{
        p = pozoleria.createPozole("hola","caca");
        p.getName();

    }
    @Test(expected= java.lang.Exception.class)
    public void test27() throws Exception{
        p = pozoleria.createPozole("Rojo","caca");
        p.getName();

    }
    @Test(expected= java.lang.Exception.class)
    public void test28() throws Exception{
        p = pozoleria.createPozole("Blanco","caca");
        p.getName();

    }
    @Test(expected= java.lang.Exception.class)
    public void test29() throws Exception{
        p = pozoleria.createPozole("Verde","caca");
        p.getName();

    }
    @Test(expected= java.lang.Exception.class)
    public void test30() throws Exception{
        p = pozoleria.createPozole("Pozolillo","caca");
        p.getName();

    }




}
