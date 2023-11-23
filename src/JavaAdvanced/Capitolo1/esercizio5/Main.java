package JavaAdvanced.Capitolo1.esercizio5;

//Scrivere una funzione che accetti in input un numeratore e un denominatore
//        Controlli che il numeratore e il denominatore non siano null
//        Usare la funzione appena scritta in due blocchi di codice dove
//        si cattura l'eventuale eccezione.
public class Main {

    public static double control(Integer numeratore,Integer denominatore) {

           if (numeratore == null || denominatore == null) {
               throw new IllegalArgumentException();
           } else {
               return numeratore / denominatore;
           }
    }


    public static void main(String[] args) {
        //scrivo il primo blocco dove non ho valori null
        Integer numeratore1 = 10;
        Integer denominatore1 = 5;

        divisionCheck(numeratore1, denominatore1, " Nel risultato 1 c'è stato un errore: ");

        //scrivo il secondo blocco dove ho un valore null
        Integer numeratore2 = null;
        Integer denominatore2 = 5;

        divisionCheck(numeratore2, denominatore2, "Nel risultato 2 c'è stato un errore: ");
    }

    private static void divisionCheck(Integer numeratore1, Integer denominatore1, String x) {
        try {
            double divisione1 = control(numeratore1, denominatore1);
            System.out.println("Risultato 1 = " + divisione1);
        } catch (IllegalArgumentException e) {
            System.out.println(x + e.getMessage());
        }
    }
}
