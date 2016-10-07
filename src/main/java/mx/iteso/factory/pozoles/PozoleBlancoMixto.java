package mx.iteso.factory.pozoles;

import mx.iteso.factory.Pozole;

/**
 * Created by Edmundo on 04/10/2016.
 */
public class PozoleBlancoMixto extends Pozole {
    public PozoleBlancoMixto() {
        name = "Pozole Blanco mixto";
        broth = "Caldo Blanco";
        toppings.add("Oregano");
        toppings.add("Col");
        toppings.add("Rabanos");
    }
}
