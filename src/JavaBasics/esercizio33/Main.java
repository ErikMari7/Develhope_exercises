package JavaBasics.esercizio33;

//Scrivere un programma che contenga una classe chiamata
//        Forma ed un metodo chiamato calcolaArea() che stampi l'area della forma.
//        Crea poi una sottoclasse chiamata Rettangolo che
//        fa override del metodo calcolaArea() per calcolare l'area del rettangolo.

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(60,72);
        System.out.println("Area della forma: " + forma.calcolaArea());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());

    }
}
