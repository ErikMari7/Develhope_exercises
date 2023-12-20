package JavaBasics.esercizio37;

//Scrivere un programma che contenga una classe chiamata Forma
//        ed un metodo chiamato calcolaArea() che stampi l'area della forma specifica.
//        Crea poi due sottoclassi Triangolo e Rettangolo
//        che estendono Forma e che abbiano un tipo che ne identifichi
//        la Forma in maniera univoca usando una enum.

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(72,99, TipoForma.Rettangolo);
        Triangolo triangolo = new Triangolo(12,20, TipoForma.Triangolo);
        System.out.println("Area della forma: " + forma.calcolaArea());
        System.out.println("Area del " + TipoForma.Rettangolo + " è: " + rettangolo.calcolaArea());
        System.out.println("Area del " + TipoForma.Triangolo + " è: " +triangolo.calcolaArea());
    }
}
