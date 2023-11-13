package JavaAdvanced.esercizio1;

//Scrivere una funzione che controlli
//        se un numero int è in un determinato range
//        Se lo è ritorna true se non lo è lancia un'eccezione

public class Main {
    public static void main(String[]args) {
        int Numero = 10;
        System.out.println(RangeNumero(Numero));
    }

    public static boolean RangeNumero(int Numero) {

        boolean result = true;

            try {
                if(Numero <= 0 || Numero > 10) {
                    throw new ArithmeticException("Numero");
                }
            } catch (ArithmeticException e) {
                System.out.println("C'è stato un errore: " + e);
                result = false;
            }

        return result;
    }
}
