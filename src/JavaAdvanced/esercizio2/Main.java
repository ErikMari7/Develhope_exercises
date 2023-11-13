package JavaAdvanced.esercizio2;

//Scrivere una funzione che controlli se un carattere
//        è un numero altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[]args) {
        char First = '9';
        if(Character.isDigit(First)) {
            System.out.println("È un numero");
        } else {
            try {
                throw new ArithmeticException();
            } catch (ArithmeticException e) {
                System.out.println("C'è stato un errore");
            }
        }
    }
}
