package JavaAdvanced.Capitolo4.esercizio6;

//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//        All'interno di User ci sarà anche una funzione che stampi a
//        video le informazioni di età e il nome.
//        Creare 2 oggetti User di cui creerà un'istanza.
//        Del primo si stamperanno le informazioni di default,
//        del secondo si cambieranno le informazioni e poi si stamperanno a video


public class Main {
    public static void main(String[] args) {
        User user1 = User.getInstance();
        User user2 = User.getInstance();

        System.out.println("Primo user");
        user1.stampa();

        user2.setNome("Paolo");
        user2.setEtà(22);

        System.out.println("Secondo user");
        user2.stampa();

    }
}
