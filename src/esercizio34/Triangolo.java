package esercizio34;

public class Triangolo extends Forma{
    @Override
    public int calcolaArea() {
        return (getBase() * getAltezza()) /2;
    }
}
