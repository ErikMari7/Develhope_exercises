package Checkpoint1;

//Scrivere un metodo che a partire da un array calcoli il valore massimo e il valore minimo e
//        stampi l’informazione a video.

//Scrivere un metodo che calcoli la somma di tutti i numeri pari
//        all’interno dell’array e stampi l’informazione a video.

//Implementare una funzione che, dato un array di stringhe, verifichi
//        la presenza di una stringa di lunghezza specifica inserita
//        dall'utente e restituisca il risultato della ricerca sotto
//        forma di valore booleano (true o false). Il risultato dovrebbe
//        essere visualizzato a video.

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        String[] array1 = {"string","parola"};
        risultato(array);
        sumOf(array);
        System.out.println(stringLength(array1,5));

    }
    public static void risultato(int[]array) {
        int valueMax= 0;
        int valueMin= array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > valueMax) {
                valueMax = array[i];
            }
            if(array[i] < valueMin) {
                valueMin = array[i];
            }
        }
        System.out.println("Il valore massimo è: " + valueMax);
        System.out.println("Il valore minimo è: " + valueMin);
    }

    public static void sumOf(int[]array) {
        int somma = 0;
        for(int number : array) {
            if (number % 2 == 0) {
                somma += number;
            }

        }
        System.out.println("La somma dei numeri pari è: " + somma);
    }

    public static boolean stringLength(String[]array1,int lunghezza) {
         boolean risultato = false;
         for(int i = 0; i< array1.length; i++) {
             if(array1[i].length() > lunghezza) {
                 risultato = true;
                 break;
             }
         }
         return risultato;

    }
}
