package JavaBasics.esercizio29;

public class Studente {

    private String nome;

    private String cognome;

    private int ID;

    public Studente(String nome, String cognome, int ID) {
        this.nome = nome;
        this.cognome = cognome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String setCognome(String cognome) {
        this.cognome = cognome;
        return cognome;
    }

    public int getID() {
        return ID;
    }

    public int setID( int ID) {
        this.ID =ID;
        return ID;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", ID=" +  ID +
                '}';
    }
}
