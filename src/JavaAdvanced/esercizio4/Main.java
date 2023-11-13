package JavaAdvanced.esercizio4;

//Scrivere una funzione che accetti un array in input e provi
//        a dividere un numero dell'array per 0 e gestisca sia
//        l'eccezione della divisione che quella di indice non presente
//        nell'array, leggendone il messaggio. Eseguire sempre un blocco
//        di codice scrivendo un messaggio in console.

public class Main {
    public static void main(String[]args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        operazione(array);
    }
    public static void operazione(int[] array) {
        int divisione = 0;
        try {
            System.out.println(divisione = array[10]/0);
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Message String: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Message String: " + e.getMessage());
        } finally {
            System.out.println("Problema risolto");
        }

    }
}
