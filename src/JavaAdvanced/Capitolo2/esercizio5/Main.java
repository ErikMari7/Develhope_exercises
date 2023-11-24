package JavaAdvanced.Capitolo2.esercizio5;

//Creare un hashmap prendere tutti i valori, ordinarli e stamparli

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, String> videogiochi = new HashMap<>();
        videogiochi.put("Sparatutto", "Overwatch2");
        videogiochi.put("Picchiaduro", "Street Fighter V");
        videogiochi.put("BattleRoyale","Fortnite");
        videogiochi.put("Sportivo", "Formula1");

        List<String> alfabeticOrder = new ArrayList<>(videogiochi.values());
        Collections.sort(alfabeticOrder);

        System.out.println("Map ordinata in ordine alfabetico: " + alfabeticOrder);
    }
}
