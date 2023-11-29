package JavaAdvanced.Capitolo3.esercizio3;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//        ottieni l'anno
//        ottieni il mese
//        ottieni il giorno
//        ottieni il giorno della settimana
//        Stampa i risultati sulla console


import java.time.OffsetDateTime;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataYear = String.valueOf(data.getYear());
        String dataMonth = String.valueOf(data.getMonth());
        String dataDay = String.valueOf(data.getDayOfMonth());
        String dataDayOfTheWeek = String.valueOf(data.getDayOfWeek());

        System.out.println("Anno: "+ dataYear);
        System.out.println("Mese: "+ dataMonth);
        System.out.println("Giorno: "+ dataDay);
        System.out.println("Giorno della settimana: "+ dataDayOfTheWeek);

    }
}
