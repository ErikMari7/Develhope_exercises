package JavaAdvanced.Capitolo1.esercizio2;

//Scrivere una funzione che controlli se un carattere
//        è un numero altrimenti lanciare una eccezione.

public class Main {
    public static void main(String[]args) {
        char First = 'x';
        control(First);
    }
    public static void control(char First) {
        if(Character.isDigit(First)) {
            System.out.println("È un numero");
        } else {
            throw new ArithmeticException("Il carattere non è un numero");
        }
    }
}

