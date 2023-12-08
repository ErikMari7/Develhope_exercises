package JavaAdvanced.Capitolo4.esercizio5;

//Crea una classe Péerson con i campi firstName, lastName, age e address, i getter and i setter
//        Il costruttore accetterà un Builder in input
//        Creare una classe Builder che attraverso il costruttore
//        e dei metodi specifici (tranne nome e cognome,
//        gli altri campi sono opzionali) per costruire l'oggetto Person.
//        Creare due oggetti Person e stamparli a video

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder("Maria", "Florenzi");

        Person primaPersona = builder.build();

        PersonBuilder builder1 = new PersonBuilder("Paolo", "Bianchi");
        builder1.setAge(21);
        builder1.setAddress("Via Brombeis");

        Person secondaPersona = builder1.build();

        System.out.println("Prima persona: " + primaPersona + "\nSeconda persona: " + secondaPersona);

    }
}
