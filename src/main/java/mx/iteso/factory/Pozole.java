package mx.iteso.factory;

import java.util.ArrayList;

public abstract class Pozole {
    public String name;
    public String broth;
    public ArrayList toppings = new ArrayList();


    public String serve() {
        System.out.println("Serving in regular pozole plate..." );
        String out = "Serving in regular pozole plate...";
        return out;
    }

    public String prepare() {
        String out;
        System.out.println("Preparing " + name);
        out = "Preparing " + name;
        System.out.println("Adding corn kernels..." );
        out +="Adding corn kernels...";
        System.out.println("Adding broth..." );
        out += "Adding broth...";
        System.out.println("Adding toppings:" );
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
            out += "    " + toppings.get(i);
        }
        return out;

    }
    public String getName(){
        return name;
    }
}