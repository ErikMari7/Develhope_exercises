package JavaBasics.esercizio39;

//Scrivi un programma Java che abbia un metodo che
//        prenda il carattere in Unicode in un indice specifico
//        all'interno di una stringa e lo stampi.
//        Il metodo dovrà avere nel costruttore una stringa
//        ed una posizione e dovrà resituire il carattere in unicode o una stringa di errore.
//        Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
public class Main {
    public static void main(String[]args) {
        String Parola = "pecora";
        int index = 5;
        System.out.println(unicodeValue(Parola,index));
    }
    public static String unicodeValue(String Parola,int index) {
        StringBuilder value = new StringBuilder();
        if(index < 0 || index > Parola.length()) {
            value.append("Errore");
        } else {
            value.append(Parola.codePointAt(index));
        }
        return value.toString();

    }
}
