package JavaAdvanced.esercizio3;

//Scrivere una funzione che provi a dividere un numero per
//        0 e catturi l'eccezione leggendone il messaggio.

public class Main {
    public static void main(String[] args) {
        int Numero = 2;
        division(Numero);
    }

    public static void division(int Numero) {
        try {
            int Risultato = Numero / 0;
        } catch (ArithmeticException e) {
            System.out.println("Message String = " + e.getMessage());
        }
    }
}
