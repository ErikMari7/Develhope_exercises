package JavaAdvanced.esercizio8;

//Scrivere una funzione che restituisca un HashSet riempito
//        Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
//        Verificare che l' elemento sia parte del Set e stampare il risultato

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Numero numero = new Numero(5);
        Set<Numero> numeri = hashSet(numero);
        if(numeri.contains(numero)) {
            System.out.println("Il numero è contenuto nel set");
        } else {
            System.out.println("Il numero non è contenuto nel set");
        }

    }

    public static Set<Numero> hashSet (Numero numero) {
        Set<Numero> lista = new HashSet<>();
        lista.add(numero);
        lista.add(new Numero(1));
        lista.add(new Numero(2));
        lista.add(new Numero(3));
        lista.add(new Numero(4));
        return lista;
    }
}
