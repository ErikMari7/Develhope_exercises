package JavaAdvanced.Capitolo2.esercizio2;

//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//        In questa classe avere i metodi pubblici per ottenere le informazioni.
//        Creare un ArrayList con 12 elementi e stamparlo in console.
//        mettere in ordine la collezione e stampare il risultato

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mario",17);
        Student student2 = new Student("Luca",18);
        Student student3 = new Student("Giorgio",19);
        Student student4 = new Student("Andrea",16);
        Student student5 = new Student("Maria",22);
        Student student6 = new Student("Giulia",21);
        Student student7 = new Student("Sara",27);
        Student student8 = new Student("Piero",18);
        Student student9 = new Student("Franco",20);
        Student student10 = new Student("Rosanna",24);
        Student student11 = new Student("Rosalba",25);
        Student student12 = new Student("Alessandro",23);

        List<Student> lista1 = new ArrayList<>(Arrays.asList(student1,student2,student3,student4, student5,student6,student7,student8,student9,student10,student11,student12));

        System.out.println("Lista iniziale: " + lista1);

        lista1.sort(Comparator.comparing(Student::getAge));

        System.out.println("Lista ordinata per età: " + lista1);
    }
}
