package devices;

import creatures.FarmAnimal;
import creatures.Pet;

import java.net.URL;
import java.util.ArrayList;

public class main {
    public static void  main(String[] args){
        Car[] lista = new Car[2];
        Disel c1 = new Disel("A3", "Audi", "2000", 5000.0, 2018);
        Electric c2 = new Electric("A4", "Audi", "2005", 7000.0, 2012);
        lista[0] = c1;
        lista[1] = c2;
        Human h1 = new Human("Patryk", "Aleksandrowicz", 12, "men", 2000.0, 2, lista);
        Human h2 = new Human("Patryk", "Paprykowicz", 13, "men", 4000.0);
        System.out.println(h1.getCar(0).getModel());
        Electric c3 = new Electric("A5", "Golf", "200", 200.0, 2011);
        h1.setCar(c3, 0);
        System.out.println(h1.getCar(0).getModel());
        System.out.println(h1.suma());

        System.out.println(h1.getCar(0).getModel());
        System.out.println(h1.getCar(1).getModel());

        h1.sortuj();

        System.out.println(h1.getCar(0).getModel());
        System.out.println(h1.getCar(1).getModel());

        h1.setCash(30000.0);
        h2.setCash(50000.0);

        c3.sell(h1,h2,200.0, c3);

        //System.out.println(h1.getCar(0).getModel()); //null pointer exception
        System.out.println(h2.getCar(0).getModel());

    }
}