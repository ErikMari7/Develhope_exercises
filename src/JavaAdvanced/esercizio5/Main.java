package JavaAdvanced.esercizio5;

//Scrivere una funzione che accetti in input un numeratore e un denominatore
//        Controlli che il numeratore e il denominatore non siano null
//        Usare la funzione appena scritta in due blocchi di codice dove
//        si cattura l'eventuale eccezione.
public class Main {

    public static double control(Integer numeratore,Integer denominatore) {
       try {
           if (numeratore == null || denominatore == null) {
               throw new IllegalArgumentException();
           } else {
               return numeratore / denominatore;
           }
       } catch (IllegalArgumentException e) {
           throw new IllegalArgumentException();
       }
    }

    public static void main(String[] args) {
        //scrivo il primo blocco dove non ho valori null
        Integer numeratore1 = 10;
        Integer denominatore1 = 5;

        try {
            double divisione1 = control(numeratore1,denominatore1);
            System.out.println("Risultato 1 = " + divisione1);
        } catch (IllegalArgumentException e) {
            System.out.println(" Nel risultato 1 c'è stato un errore: " + e.getMessage());
        }

        //scrivo il secondo blocco dove ho un valore null
        Integer numeratore2 = null;
        Integer denominatore2 = 5;

        try {
            double divisione2 = control(numeratore2,denominatore2);
            System.out.println("Risultato 1 = " + divisione2);
        } catch (IllegalArgumentException e) {
            System.out.println("Nel risultato 2 c'è stato un errore: " + e.getMessage());
        }
    }
}
