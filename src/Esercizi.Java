/*
Scrivi un programma che contenga un metodo
        che prende in ingresso un valore numerico e stampa tutti i numeri fino
        al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
*/
 class Esercizio1CicliAvanzati {
    public static void main(String args[]) {
        int value = 10;
        allValueUpTo5(value);
    }
    public static void allValueUpTo5(int value) {
        for(int x = 0; x <= value; x++) {
            if(x == 5) {
                break;
            }
            System.out.println(x);
        }
    }
}