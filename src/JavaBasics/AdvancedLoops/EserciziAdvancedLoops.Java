package JavaBasics.AdvancedLoops;

/*
Scrivi un programma che contenga un metodo
        che prende in ingresso un valore numerico e stampa tutti i numeri fino
        al valore immesso, la stampa dovrà interrompersi se il valore è uguale a 5.
*/
 class Ex22 {
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
/*
    Scrivi un programma che contenga un metodo che
    prende in ingresso un valore numerico e stampa
     tutti i numeri fino al valore immesso, la stampa dovrà saltare il valore uguale a 5.
 */
 class Ex23 {
     public static void main(String args[]) {
         int value = 12;
         allValueAndJump5(value);
     }
     public static void allValueAndJump5(int value) {
         for(int x = 0; x <= value; x++) {
             if(x == 5) {
                 continue;
             }
             System.out.println(x);
         }
     }
 }
