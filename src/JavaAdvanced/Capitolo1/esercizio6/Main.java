package JavaAdvanced.Capitolo1.esercizio6;

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
        int primoInt = 5;
        Integer primoInteger = primoInt;
        int secondoInt = 10;
        Integer secondoInteger = secondoInt;
        double primodouble = 12.4;
        Double primoDouble =  primodouble;
        char primochar = 'a';
        Character primocharacter = primochar;

        //faccio l'unboxing degli oggetti
        Integer terzoInteger = 7;
        int terzoint = terzoInteger;
        Integer quartoInteger = 12;
        int quartoint = quartoInteger;
        Double secondoDouble = 20.2;
        double secondodouble = secondoDouble;
        Character secondoCharacter = 'b';
        char  secondocharacter = secondoCharacter;

        //uso le funzioni scritte mettendo i valori creati prima
        sommaInt(primoInteger,secondoInteger);
        charStamp(primocharacter);
        sommaInteger(terzoint,quartoint);
        characterStamp(secondocharacter);


    }

    public static void sommaInt(int Int1, int Int2) {
        Integer SumOf = Int1 + Int2;
        System.out.println(SumOf);
    }

    public static void charStamp(char Char1) {
        System.out.println(Char1);
    }

    public static void sommaInteger(Integer Integer1, Integer Integer2) {
        int SumOf = Integer1 + Integer2;
        System.out.println(SumOf);
    }

    public static void characterStamp(Character Character1) {
        System.out.println(Character1);
    }

}
