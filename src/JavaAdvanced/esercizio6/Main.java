package JavaAdvanced.esercizio6;

//Scrivere una funzione che accetti in input 2 int e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 char lo stampi
//        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
//        Scrivere una funzione che accetti in input 1 Character lo stampi
//        Scrivere un un valore primitivo per int, double e char e fare autoboxing
//        Scrivere un oggetto per Integer, Double e Character e fare Unboxing
//        Usare le funzioni scritte con i valori creati

public class Main {
    public static void main(String[]args) {
        //faccio l'autoboxing dei valori primitivi
        int intValue = 5;
        Integer integerValue = intValue;
        double doubleValue = 12.4;
        Double DoubleValue = doubleValue;
        char charValue = 'a';
        Character characterValue = charValue;

        //faccio l'unboxing degli oggetti
        Integer integerValue2 = 7;
        int intValue2 =integerValue2;
        Double DoubleValue2 = 20.2;
        double doubleValue2 = DoubleValue2;
        Character characterValue2 = 'b';
        char  charValue2 = characterValue2;

        //uso le funzioni scritte mettendo i valori creati prima
        sommaInt(intValue,intValue2);
        charStamp(charValue2);
        sommaInteger(integerValue,integerValue2);
        characterStamp(characterValue);


    }

    public static void sommaInt(int Int1, int Int2) {
        int SumOf = Int1 + Int2;
        System.out.println(SumOf);
    }

    public static void charStamp(char Char1) {
        System.out.println(Char1);
    }

    public static void sommaInteger(Integer Integer1, Integer Integer2) {
        Integer SumOf = Integer1 + Integer2;
        System.out.println(SumOf);
    }

    public static void characterStamp(Character Character1) {
        System.out.println(Character1);
    }

}
