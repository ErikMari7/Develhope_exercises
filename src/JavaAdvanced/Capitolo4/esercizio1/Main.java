package JavaAdvanced.Capitolo4.esercizio1;

//Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
//        (Addizione, sottrazione, moltiplicazione e divisione, min e max)
//        definita in un enum, crei un metodo per calcolare
//        l'operazione richiesta e e ritorni il risultato.
//        Il tipo di operazione, i due dati in input e il
//        risultato dovranno essere stampati a schermo

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal value1 = BigDecimal.valueOf(17.8);
        BigDecimal value2 = BigDecimal.valueOf(0);
        System.out.println("Il tipo di operazione è: " + Operazione.Divisione);
        System.out.println("Primo valore in input: " + value1);
        System.out.println("Secondo valore in input: " + value2);
        System.out.println("Risultato operazione: " + Calcolo(value1,value2,Operazione.Divisione));

    }

    public static BigDecimal Calcolo(BigDecimal value1, BigDecimal value2, Operazione tipo) {
        switch (tipo) {
            case Addizione:
                return value1.add(value2);
            case Sottrazione:
                return value1.subtract(value2);
            case Moltiplicazione:
                return value1.multiply(value2);
            case Divisione:
                if (value2.compareTo(BigDecimal.ZERO) != 0) {
                    return value1.divide(value2, 2, BigDecimal.ROUND_UP);
                } else {
                    System.out.println("Errore: Impossibile dividere per zero.");
                    return BigDecimal.ZERO;
                }
            case Min:
                return value1.min(value2);
            case Max:
                return value1.max(value2);
            default:
                System.out.println("Errore: operazione non supportata");
                return BigDecimal.ZERO;
        }
    }
}


