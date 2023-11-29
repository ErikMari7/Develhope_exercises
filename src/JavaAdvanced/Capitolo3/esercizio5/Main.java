package JavaAdvanced.Capitolo3.esercizio5;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
//        verificare che la prima data è precedente alla seconda
//        verificare che la seconda data è successiva alla prima
//        verificare che le due date sono uguali ad ora
//        Stampa il risultato

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean data1IsBefore = data1.isBefore(data2);
        boolean data2IsAfter = data2.isAfter(data1);
        boolean dateAreEquals =  data1.isEqual(data2);

        System.out.println("La prima data è precedente alla seconda: "+ data1IsBefore);
        System.out.println("La seconda data è successiva alla prima: "+ data2IsAfter);
        System.out.println("Le due date sono uguali: "+ dateAreEquals);

    }
}
