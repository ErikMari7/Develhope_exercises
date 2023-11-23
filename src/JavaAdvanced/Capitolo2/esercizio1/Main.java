package JavaAdvanced.Capitolo2.esercizio1;

//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con n elementi e stamparlo in console.
//        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Paolo", 17);
        Student student2 = new Student("Giorgio", 16);
        List<Student> lista1 = new ArrayList<>(Arrays.asList(student1,student2));

        System.out.println("Collezione iniziale: "+ lista1);

        Student student3 = new Student("Elisa", 18);
        Student student4 = new Student("Luca",20);
        Student student5 = new Student("Marco",22);
        Student student6 = new Student("Giada",19);

        lista1.add(student3);
        lista1.add(student4);
        lista1.add(student5);
        lista1.add(student6);



        System.out.println("Collezione finale: "+ lista1);
    }
}
