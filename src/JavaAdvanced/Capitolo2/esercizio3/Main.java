package JavaAdvanced.Capitolo2.esercizio3;

//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un LinkedList con elementi e stamparlo in console.
//        Aggiungere un elemento al primo posto della lista e uno all'ultimo
//        Stampare la collezione aggiornata

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Banana");
        Fruit fruit2 = new Fruit("Mela");

        LinkedList<Fruit> lista = new LinkedList<>();
        lista.add(fruit1);
        lista.add(fruit2);

        System.out.println("Lista iniziale: " + lista);

        Fruit fruit3 = new Fruit("Pera");
        Fruit fruit4 = new Fruit("Ananas");

        lista.addFirst(fruit3);
        lista.addLast(fruit4);

        System.out.println("Lista con elementi aggiunti: " + lista);
    }
}
