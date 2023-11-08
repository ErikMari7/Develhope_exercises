package esercizio34;


//A partire dal programma creato precedentemente in cui
//        si richiedeva il calcolo dell'area aggiungere una ulteriore
//        classe chiamata Triangolo supportando poi il calcolo dell'
//        area per quest'ultima figura
public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo();
        Triangolo triangolo = new Triangolo();
        System.out.println("Area forma: " + forma.calcolaArea());
        System.out.println("Area Rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Area Triangolo: " + triangolo.calcolaArea());
    }
}
