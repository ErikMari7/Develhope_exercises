package esercizio35;

//Scrivere un programma che contenga una classe astratta
//        chiamata Forma ed un metodo astratto chiamato calcolaArea().
//        Crea poi due sottoclassi Rettangolo e Triangolo che estendono
//        Forma ed implementano il metodo per il calcolo dell'area in maniera specifica.
public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(72,99);
        Triangolo triangolo = new Triangolo(12,20);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}
