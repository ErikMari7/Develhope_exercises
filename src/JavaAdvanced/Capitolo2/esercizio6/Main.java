package JavaAdvanced.Capitolo2.esercizio6;

//Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Punto punto1 = new Punto(3.0,4.0);
        Punto punto2 = new Punto(6.7,2.0);
        Punto punto3 = new Punto(4.6,8.2);

        Map<String, Punto> punti = new HashMap<>();
        punti.put("Coordinata1", punto1);
        punti.put("Coordinata2",punto2);
        punti.put("Coordinata3",punto3);

        System.out.println("Punti con coordinate x & y: " + punti);
    }
}
