public class MainEx29 {
    public static void main(String[]args) {
        StudenteEx29 studente1 = new StudenteEx29("Paolo","Rossi",12345);

        System.out.println("Studente1: "+ studente1);

        System.out.println("Studente1 nome con getter: " + studente1.getNome());
        System.out.println("Studente1 cognome con getter: " + studente1.getCognome());
        System.out.println("Studente1 ID con getter: " + studente1.getID());

        System.out.println("Studente1 nome con setter: " + studente1.setNome("Erik"));
        System.out.println("Studente1 nome con setter: " + studente1.setCognome("Marigliano"));
        System.out.println("Studente1 nome con setter: " + studente1.setID(1234567));

        System.out.println("Studente1 dopo setter: " + studente1);
    }
}
