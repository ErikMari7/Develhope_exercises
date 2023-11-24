package JavaAdvanced.Capitolo2.esercizio4;

//Creare 3 hashmap con 3 differenti metodi
//        di inizializzazione e stampare il contenuto.

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> sport = new HashMap<>();
        sport.put("Racchetta","Tennis");
        sport.put("Palla di cuoio","Calcio");
        sport.put("Palla a spicchi", "Basket");

        System.out.println("Prima map: "+ sport);

        Map<String, String> nazioni = Map.of(
                "Europa",
                "Italia",
                "Asia",
                "Cina",
                "Oceania",
                "Australia");

        System.out.println("Seconda map: " + nazioni);

        Map<String, String> videogiochi = Map.ofEntries(
                new AbstractMap.SimpleEntry<>("Sparatutto", "Call of Duty: modern warfare 3"),
                new AbstractMap.SimpleEntry<>("Sportivi", "Fc 2024"),
                new AbstractMap.SimpleEntry<>("Jrpg", "Sea of Stars")
        );

        System.out.println("Terza map: " + videogiochi);
    }
}
