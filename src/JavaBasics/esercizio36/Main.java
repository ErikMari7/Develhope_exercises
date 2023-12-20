package JavaBasics.esercizio36;

//Scrivere un programma che contenga una interfaccia
//        Forma ed un metodo chiamato calcolaArea().
//        Crea poi due sottoclassi Rettangolo e Triangolo
//        che implementano Forma ed implementano il metodo per il calcolo dell'area.

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(7,8);
        Triangolo triangolo = new Triangolo(10,20);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}
