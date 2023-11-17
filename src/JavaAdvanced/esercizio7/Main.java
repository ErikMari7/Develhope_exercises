package JavaAdvanced.esercizio7;

//Scrivere una funzione che restituisca un hashset riempito
//        Leggere l'hashSet e stampare grandezza ed elementi

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("L'hashSet riempito: " + hashSet());
        System.out.println("La grandezza dell'hashSet è: " + hashSet().size());

        for(Integer element: hashSet()) {
            System.out.println("Elemento: " + element);
        }

    }
    public static Set<Integer> hashSet () {
        Set<Integer> lista = new HashSet<>(Arrays.asList(1,2,3,4,5,3,5));
        return lista;
    }
}
