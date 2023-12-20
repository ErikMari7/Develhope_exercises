package JavaBasics.esercizio38;

//Scrivi un programma Java che abbia un metodo che prenda due
//        stringhe e le compari lessico-graficamente.
//        Il metodo dovrà restituire "Le due stringhe sono uguali"
//        o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//        Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
public class Main {
    public static void main(String[]args) {
        String Parola1 = "mela";
        String Parola2 = "Mela";

        StringBuilder comparazione = new StringBuilder("Le due stringhe sono ");
        if(Parola1.equals(Parola2)) {
            comparazione.append("uguali");
        } else {
            comparazione.append("differenti");
        }
        System.out.println(comparazione);
    }
}
