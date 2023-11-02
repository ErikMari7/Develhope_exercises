public class MainEx29 {
    public static void main(String[]args) {
        StudenteEx29 studente1 = new StudenteEx29("Paolo","Rossi",12345);

        System.out.println(java.util.Arrays.toString(new StudenteEx29[]{studente1}));

        System.out.println("Studente1 nome con getter: " + studente1.getNome());
        System.out.println("Studente1 cognome con getter: " + studente1.getCognome());
        System.out.println("Studente1 ID con getter: " + studente1.getID());

        studente1.setNome("Erik");
        studente1.setCognome("Marigliano");
        studente1.setID(1234567);

        System.out.println("Studente1 con setter: " + studente1);
    }
}
