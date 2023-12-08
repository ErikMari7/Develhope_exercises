package JavaAdvanced.Capitolo4.esercizio6;

public class User {

    private static User user;

    private String nome;

    private int età;

    public static User getInstance() {
        if (user == null) {
            user = new User();
            user.nome= "nome di default";
            user.età= 0;
        }
        return user;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public void stampa() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + età);
    }

}
