package esercizio34;


//A partire dal programma creato precedentemente in cui
//        si richiedeva il calcolo dell'area aggiungere una ulteriore
//        classe chiamata Triangolo supportando poi il calcolo dell'
//        area per quest'ultima figura
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(72,99);
        Triangolo triangolo = new Triangolo(12,20);
        System.out.println("Area della forma: " + forma.calcolaArea());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area del triangolo: " + triangolo.calcolaArea());
    }
}
