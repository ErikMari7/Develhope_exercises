package JavaAdvanced.Capitolo3.esercizio8;

//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//        Formatta la data ottenendo 01 marzo 2023
//        Stampa sulla console
//        Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

    }

    public String finalData (OffsetDateTime data) {
        String dataModified = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        return dataModified;
    }
}
