package mx.iteso.factory.stores;

import mx.iteso.factory.Pozole;
import mx.iteso.factory.PozoleStore;
import mx.iteso.factory.pozoles.*;

public class AllPozoleStore {

    private PozoleStore store;

    public Pozole createPozole(String tipo,String meat) {
        if(tipo.equals("Rojo"))
        {
            store = new PozoleRojoStore();
        }
        else if(tipo.equals("Verde"))
        {
            store = new PozoleVerdeStore();
        }
        else if(tipo.equals("Blanco"))
        {
            store = new PozoleBlancoStore();
        }
        else if(tipo.equals("Pozolillo"))
        {
            store = new PozolilloStore();
        }
        else if(tipo.equals("Menudo"))
        {
            store = new MenudoStore();
        }
        else
        {
            return null;
        }

        return store.createPozole(meat);

    }
}
