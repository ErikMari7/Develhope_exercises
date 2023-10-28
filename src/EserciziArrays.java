/*  Scrivi un programma che contenga un metodo
 che crea un array e lo riempie con i numeri da
  1 a 10 e che che calcoli la somma dei numeri
  contenuti nell'array inizializzato e la stampi a video.
*/
class Ex24 {
    public static void main(String args[]) {
    arrayCreationAndSum();
    }
    public static void arrayCreationAndSum() {
        int Numbers[] = new int[10];
        int somma = 0;
            for(int i = 0; i < Numbers.length; i++) {
                Numbers[i] = i + 1;
            }
            for(int SumOfNumbers: Numbers) {
                     somma += SumOfNumbers;
            }
            System.out.println("La somma di tutti i numeri contenuti nell'array è: " + somma);

    }
}

/*  Scrivi un programma che contenga un metodo
 che crea un array e lo riempie con dei caratteri.
  Questo metodo dovrà poi stampare tutte le occorrenze
   del carattere 'a' o 0 in caso non ce ne siano.
 */
 class Ex25 {
     public static void main(String args[]) {
        char[] Caratteri = createArray();
        SumOfAllA(Caratteri);

     }
     public static char[] createArray() {
         char[] Caratteri = {'a', 'b', 'c', 'd', 'a', 'a'};
         for (int i = 0; i < Caratteri.length; i++) {

         }
         return Caratteri;

     }
     public static void SumOfAllA(char[] Caratteri) {
         int count = 0;
         for(char CarattereA : Caratteri) {
             if(CarattereA == 'a') {
                 count++;
             }
         }
         if(count > 0) {
             System.out.println("Il carattere a viene stampato " + count + "volte");
         } else {
             System.out.println("Il carattere a non viene stampato nessuna volta");
         }
     }


}

