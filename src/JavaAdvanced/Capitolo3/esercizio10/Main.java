package JavaAdvanced.Capitolo3.esercizio10;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        aggiungi un anno
//        sottrai un mese
//        aggiungi 7 giorni
//        Stampa il risultato localizzata per l'Italia
//        Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    }

    public String finalData (OffsetDateTime data) {
        OffsetDateTime data2 = data.plusYears(1).minusMonths(1).plusDays(7);
        String data2Finale = data2.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));

        return data2Finale;
    }
}
