/* Scrivere un programma che contenga una classe
 che definisce uno StudenteEx29 che abbia come proprietà
  nome, cognome ed identificativo.
  Per questa classe saranno necessari i metodi accessori
(getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo StudenteEx29.
 */



public class StudenteEx29 {
    private String nome;

    private String cognome;

    private int ID;

    public StudenteEx29(String nome, String cognome, int ID) {
        this.nome = nome;
        this.cognome = cognome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getID() {
        return ID;
    }

    public void setID( int ID) {
        this.ID =ID;
    }

    @Override
    public String toString() {
        return "StudenteEx29{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", ID=" +  ID +
                '}';
    }
}
