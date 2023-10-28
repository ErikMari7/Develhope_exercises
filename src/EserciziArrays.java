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
        int[] Numbers = {1,2,3,4,5,6,7,8,9,10};
            for(int i = 0; i <= Numbers.length; i++){
                for(int SumOfNumbers: Numbers) {
                    i += SumOfNumbers;
                }
                System.out.println("La somma di tutti i numeri contenuti nell'array è: " + i);
            }

    }
}
