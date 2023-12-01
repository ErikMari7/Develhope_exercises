package JavaAdvanced.Capitolo3.esercizio7;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//        Formatta la data ottenuta in FULL, MEDIUM e SHORT
//        Stampa le varie versioni -Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

    }
    public String fullData(OffsetDateTime data) {
        String dataFull = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        return dataFull;
    }

    public String mediumData(OffsetDateTime data) {
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        return dataMedium;
    }

    public String shortData(OffsetDateTime data) {
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        return dataShort;
    }
}
