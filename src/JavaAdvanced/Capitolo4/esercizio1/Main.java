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
        BigDecimal value1 = BigDecimal.valueOf(10.5);
        BigDecimal value2 = BigDecimal.valueOf(12.7);
        System.out.println("Il tipo di operazione è: " + Operazione.Addizione);
        System.out.println("Primo valore in input: " + value1);
        System.out.println("Secondo valore in input: " + value2);
        System.out.println("Risultato operazione: " + Calcolo(value1,value2,Operazione.Addizione));

    }

    public static BigDecimal Calcolo(BigDecimal value1, BigDecimal value2, Operazione tipo) {
        BigDecimal risultatoFinale = value1.add(value2);
        return risultatoFinale;
    }
}


