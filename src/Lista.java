
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Main {

    public static void main(String[] args) {
        List nombres = new LinkedList<>();
        // Agregamos los nombres.
        nombres.add("Aries");
        nombres.add("Tauro");
        nombres.add("Geminis");
        nombres.add("Cancer");
        nombres.add("Leo");
        nombres.add("Virgo");
        nombres.add("Libra");
        nombres.add("Escorpio");
        nombres.add("Sagitario");
        nombres.add("Capricornio");
        nombres.add("Acuario");
        nombres.add("Piscis");
        nombres.add("Sergio");
        nombres.add("Pablo");
        nombres.add("Hector");
        nombres.add("Victor");
        nombres.add("Adrian");
        nombres.add("Diana");
        nombres.add("David");
        nombres.add("Dalia");
        nombres.add("Janet");
        nombres.add("Arturo");


        for (Object nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println(" ");
        System.out.println("Así se ve la lista ordenada alfabeticamente");
        System.out.println(" ");

        // Ordenamos la lista.
        Collections.sort(nombres);

        // Imprimimos
        for (Object nombre : nombres) {
            System.out.println(nombre);
        }



    }



    }
