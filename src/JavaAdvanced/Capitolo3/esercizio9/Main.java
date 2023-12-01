package JavaAdvanced.Capitolo3.esercizio9;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        ottieni l'anno
//        ottieni il mese
//        ottieni il giorno
//        ottieni il giorno della settimana
//        Stampa i risultati sulla console -Crea dei test per questo esercizio

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

    }

    public String year(OffsetDateTime data) {
        String anno = "" + data.getYear();
        return anno;
    }

    public String month(OffsetDateTime data) {
        String mese = "" + data.getMonth();
        return mese;
    }

    public String day(OffsetDateTime data) {
        String giorno = "" + data.getDayOfMonth();
        return giorno;
    }

    public String dayOfWeek(OffsetDateTime data) {
        String giornoDellaSettimana = "" + data.getDayOfWeek();
        return giornoDellaSettimana;
    }
}
